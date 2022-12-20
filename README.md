# static-marlon

Projects history repository
- Contains the files developed to collaborate with deriv-static-content

Updates:
- 007: Waiting the requesters;
- 021: 4 templates, 4 concluded. Waiting for checks;
- 027: 8 emails, 8 updated. Waiting FE check;
  
# Templates
## template-header.html
This template was created to become a stable version of the email standards used by the Digital Marketing team at Deriv. We strongly encourage you to keep this document as well as the files `template-header.html`, `0-list.html`, `footer-en.html`, ... up to date.
### Naming and ordering
- The area for `Outlook styles` comes first as they're a comment inside the `<head>`
- Inside the styles areas, the definition of html tags preceeds the CSS classes/ elements.
- Media queries for size come next followed by media queries for dark/light modes and finally, [data-ogsc] elements.
- The CSS elements must be named with all relavant words separated by "-". The names must specify which element(s) will be impacted. Please, avoid generic names such as `.small-img` or `.new-paragraph`, try `.header-logo-low-width` or `#title-td`, `.paragraph-td`.
- The order of the elements must start with the most generic/external and end with the most specific/internal.
  - Ex. `* { ... }`, `body { ... }`, `ul { ... }`, `li { ... }`... `#ext-table { ... }`, `#ext-td { ... }`, `#int-table { ... }`, `#footer-table { ... }`, `#footer-links-td { ... }`. As shown, the html tags definition (`body`, `ul`, `li`) are ordered from the most generic to the most specific and they come before the classes/ ids defined (also ordered from the most generic to the most specific).
- The CSS properties used must be ordered considering the impact they have on the layout. We suggest box model first (`width`, `height`, `background-color`, `margin`, `padding` ...) than typography (`font-size`, `font-weight`, `line-height`, ...).
### Do's and Don'ts
 - Test changes before updating the template.
 - Check the previous styles (there are a few listed above in this manual) to see the best place to add your changes. Sometimes you just need to modify an existing style.
 - When you update a template, don't forget to update the related ones as well, e.g. all versions of the footer (EN, ID, TH, ...).
 - Avoid `!important` when it's not mandatory. If there are no style conflicts, it should not be applied.
 
