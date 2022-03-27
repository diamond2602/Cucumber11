Feature: Etsy Search Functionality

  Background:
    Given the user navigates to "https://www.etsy.com/"
@specialoutline
  Scenario Outline: Validation of etsy search Hat
    When the user searches with "<searchvalue>"
    Then the user should see the title "<titlevalidation>"
    Examples:

      | searchvalue | titlevalidation |
      | Hat         | Hats \| Etsy    |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |
      | bag         | notitle         |

   #ctrl +alt+ L --windows to organize