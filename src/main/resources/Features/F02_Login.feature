@smoke

Feature: user should be able to login to the website.


  Background: user opens browser.
    And navigates to login page.

  # Test Scenario 3
  Scenario: user login with valid data (valid email & password).
    # Login Steps:
    When user enters a valid login email.
    And user enters a valid login password.
    And user press on the login button.
  # Expected Result
    Then user logged in successfully.
    And returned to the home page of the website.


  # Test Scenario 4
  Scenario: user login with invalid data (invalid email & password).
    When user enters invalid login email.
    And user enters invalid login password.
    And user press on the login button.
  # Expected Result
    Then user could not login successfully.