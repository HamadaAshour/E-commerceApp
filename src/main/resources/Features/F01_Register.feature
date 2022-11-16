@smoke

Feature: User could register with valid data
# we will test this feature using two scenarios one when all the data is valid the second one when he enters invalid password
  Background: user opens chrome browser.
    And user navigates to registration page.

  # Test Scenario 1
  Scenario: user registers with valid data.
    When user press on the male checkbox.
    And user enters a valid first name.
    And user enters a valid last name.
    And user selects a valid date of birth.
    And user enters  valid email address.
    And user enters a valid password.
    And user confirms  valid password.
    And user clicks on the register button.
      # Expected Result
    Then user could register successfully.
    And user returned to register result webpage.
