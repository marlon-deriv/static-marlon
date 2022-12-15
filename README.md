# static-marlon

Projects history repository
  - Contains the files developed to collaborate with deriv-static-content

Updates:
  - 007: Waiting the requesters;
  - 021: 4 templates, 4 concluded. Waiting for checks;
  - 027: 8 emails, 8 updated. Waiting FE check;
  
# Templates
## template-header.html
This template was created to become a stable version of the email patterns used by the Digital Marketing team at Deriv. We strongly encourage you to keep this document as well as the base file `template-header.html` up to date.
### Naming and ordering
 - The area for `Outlook styles`  comes first as they're a comment inside the `<head>`
 - Inside the styles areas, the definition of html tags preceeds the CSS classes/ elements.
 - Media queries for size come next followed by media queries for dark/light modes and finally, [data-ogsc] elements.
 - The CSS elements must be named with all relavant words separated by "-". The names must specify which element(s) will be impacted. Please, avoid generic names such as `.small-img` or `.new-paragraph`, try `.header-logo-low-width` or `#title-td`, `.paragraph-td`.
  - The order of the elements must start with the most generic/external and end with the most specific/internal.
    - Ex. `*`, `body`, `ul`, `li`... `#ext-table`, `#ext-td`, `#int-table`, `#footer-table`, `#footer-links-td` ...
