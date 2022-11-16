@smoke

Feature: Logged user could select different Categories

  Background: user opens chrome browser.


 # Test Scenario 10
  Scenario: logged user could select category (Computers) then subcategory (Desktops)

    # let's Walk-through Category Steps:
    And user press on Computers from the homepage.
    And user selects  Desktops option from Computers.
    Then webpage redirects the user to Desktops subcategory.
    And webpage shows a Desktop computer.