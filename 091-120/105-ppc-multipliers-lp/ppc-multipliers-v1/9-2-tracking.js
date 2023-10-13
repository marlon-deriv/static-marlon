const queryParams = {
    get: (key) => {
        const params = new URLSearchParams(location.search);
        let param_values = {};
        if (typeof key === "string") {
            return params.get(key);
        } else {
            key.forEach((k) => {
                param_values[key] = params.get(k);
            });
        }
        return param_values;
    },
    set: (objects) => {
        const url = new URL(location);
        Object.keys(objects).forEach((k) => {
            const value = objects[k];
            url.searchParams.set(k, value);
        });
        return window.history.replaceState(null, null, url);
    },
    delete: (key) => {
        const url = new URL(location);
        if (typeof key === "string") {
            url.searchParams.delete(key);
        } else {
            key.forEach((k) => {
                url.searchParams.delete(k);
            });
        }
        return history.replaceState(null, null, url);
    },
};

const device =
    /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(
    navigator.userAgent)
        ? "mobile"
        : "desktop";
const getComputedStyle = (element, style) => {
    return element.computedStyleMap().get(style)?.value;
};
const validateEmail = (email) => {
    const re = /\S+@\S+\.\S+/;
    return re.test(email);
};

window.onload = (function () {
    const mySocket = new WebSocket(
        "wss://green.binaryws.com/websockets/v3?app_id=16929&l=en&brand=deriv"
    );
    mySocket.onmessage = function (msg) {
        const response = JSON.parse(msg.data);
        if (response.msg_type === "error") {
            mySocket.close();
        }
        if (response.msg_type === "verify_email") {
            // window.location.href = "http://deriv.com";
        }
    };
    mySocket.onopen = function (msg) {
        console.log("Connected to Websocket");
    };
    // Check the current active form
    // Desktop Section
    const section = document.querySelectorAll("section.flex-display")[0];
    // If desktop section is visible then use the first form
    const element_index = getComputedStyle(section, "display") === "none" ? 1 : 0;
    const form = document.querySelectorAll("form")[element_index];
    const input = document.querySelectorAll("input[type=email]")[element_index];
    const button = document.querySelectorAll("button[type=submit]")[
        element_index
    ];
    const checkbox = document.querySelectorAll("input[type=checkbox]")[
        element_index
    ];
    button.disabled = true;
    if (button.disabled) {
        button.style.opacity = "60%";
    }
    let is_checked = false;
    let is_filled = false;
    const checkEnableButton = () => {
        if (is_checked && is_filled) {
            button.disabled = false;
            button.style.opacity = "100%";
        }
    };
    checkbox.addEventListener("change", function (event) {
        is_checked = event.target.checked;
        checkEnableButton();
    });
    input.addEventListener("change", function (event) {
        is_filled = validateEmail(event.target.value);
        if (is_filled) {
            checkEnableButton();
        }
    });
    const date = new Date();
    const formatted_date = date.toISOString().split("T")[0];
    form.addEventListener("submit", function (e) {
        mySocket.send(
            JSON.stringify({
                verify_email: input.value,
                type: "account_opening",
                url_parameters: {
                    date_first_contact: formatted_date,
                    signup_device: device,
                    utm_source: queryParams.get("utm_source"),
                    utm_medium: queryParams.get("utm_medium"),
                    utm_campaign: queryParams.get("utm_campaign"),
                    utm_content: "chart-patterns",
                },
            })
        );
        e.preventDefault();
    });
})();
