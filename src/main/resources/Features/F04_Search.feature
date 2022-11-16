@smoke
Feature: Logged User can search for any product

  Background: user opens chrome browser.

    # Test Scenario 7
  Scenario: logged user should be able to search for any product.

      # Search Steps:
    And user uses the search text field and enters lenovo.
    Then user clicks on the search button.
    And user is redirected to a search webpage with the text entered in our case lenovo.