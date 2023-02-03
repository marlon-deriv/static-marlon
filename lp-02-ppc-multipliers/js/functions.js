// Open the default tab when the page loads:
document.getElementById("defaultOpen").click();

function openTab(evt, tabName) {
    // Variables:
    var i, tabcontent, tablinks;
  
    // Get all elements with class="tab-content" and hide them
    tabcontent = document.getElementsByClassName("tab-content");
    for (i = 0; i < tabcontent.length; i++) {
      tabcontent[i].style.display = "none";
    }
  
    // Get all elements with class="tab-links" and remove the class "active"
    tablinks = document.getElementsByClassName("tab-links");
    for (i = 0; i < tablinks.length; i++) {
      tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
  
    // Show the current tab, and add an "active" class to the button that opened the tab
    document.getElementById(tabName).style.display = "block";
    evt.currentTarget.className += " active";
  }

  function openDescription(evt, descName, btn) {
    // Variables:
    var i, description, arrow;

    // Get element with id selected and hide them
    description = document.getElementById(descName);
    arrow = btn.children[0];
    // alert(btn.children[0]);

    if(description.style.display == "block"){
        arrow.style.transform = "rotate(0deg)";
        description.style.display = "none";
        
    } else {
        description.style.display = "block";
        arrow.style.transform = "rotate(180deg)";
    }
  }