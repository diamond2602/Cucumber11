Feature: Login Functionality For WebOrder Page
Background:
  Given the user navigates to the WebOrder website
@smoke @regression @ahmet
  Scenario: Validation of WebOrder login Positive Scenario
  # Given the user navigates to the WebOrder website
    When the user provides credentials
    Then the user is on th home page

  Scenario: Validation of WebOrder Login Negative Scenario1
  #  Given  the user navigates to the WebOrder website
    When the user provides correct username and wrong password
    Then the user validates the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario2
 #   Given  the user navigates to the WebOrder website
    When the user provides wrong "ahmet" and  "baldir"
    Then the user validates the "Sign in Failed" error message

    #task
    #last scenario 3 should be provided empty for both
  # and validate the same message. parameters are not necessary

  @smoke @regression  @ahmet @tc1
  Scenario: Validation of WebOrder Login Negative Scenario3
   # Given  the user navigates to the WebOrder website
    When the user provides empty username and password
    Then the user validates the "Sign in Failed" error message

