@smokeLoginTest
Feature: Login Functionality For WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: Validation of WebOrder login Positive Scenario
    When the user provides credentials
    Then the user is on th home page

  Scenario Outline: Validation of WebOrder Login Negative Scenarios
    When the user provides wrong "<username>" and  "<password>"
    Then the user validates the "<errormessage>" error message

    Examples:
      | username              | password              | errormessage   |
      | ahmet                 | baldir                | Sign in Failed |
      | $#&$^#&^%&#^%         | ahmet                 | Sign in Failed |
      | Almaz                 | 123456                | Sign in Failed |
      | test1                 | hello                 | Sign in Failed |
      | 123456                |                       | Sign in Failed |
      |                       |                       | Sign in Failed |
      | @                     | 12345                 | Sign in Failed |
      | guest1@microworks.com | 123456                | Sign in Failed |
      | hello                 | Guest1!               | Sign in Failed |
      | Guest1!               | Guest1!               | Sign in Failed |
      | guest1@microworks.com | guest1@microworks.com | Sign in Failed |


