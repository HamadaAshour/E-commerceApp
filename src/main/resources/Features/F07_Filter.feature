@smoke

Feature: user can filter with color

  Background: user opens chrome browser.

 # Test Scenario 11
  Scenario: logged user could filter with red colour in Shoes Subcategory.

    # Selecting Category Steps:
    And user presses on Apparel from homepage.
    And user presses  on Shoes subcategory.
    And user selects the red checkbox.
    Then user gets Shoes options with red colour.