@special
Feature: Etsy Search Functionality
  Background:
    Given the user navigates to "https://www.etsy.com/"

  @Hat @tc1 @smoke @regression
  Scenario: Validation of etsy search Hat
    When the user searches with "Hat"
    Then the user should see the title "Hats | Etsy"

  @Hat @tc2 @smoke @regression
  Scenario: Validation of etsy search Key
    When the user searches with "Key"
    Then the user should see the title "Key | Etsy"

  @Hat @tc3 @smoke
  Scenario: Validation of etsy search Pin
    When the user searches with "Pin"
    Then the user should see the title "Pin | Etsy"

