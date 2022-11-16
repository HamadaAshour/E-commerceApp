@smoke

Feature: Logged user could select different tags.

  Background: user opens chrome browser.
    # Please add Login steps here if you want to proceed manually with this test scenario.

 # Test Scenario 12
  Scenario: logged user could select different tags.

    # first we Select Cateogory
    And user press on Computers from the homepage.

    #Tags Steps:
    And user Selects awesome tag option.
    Then webpage redirects the user to products tagged with awesome.
    And text field containing products tagged with awesome shown.
    Then user Selects cool tag option.
    And webpage redirects the user to products tagged with cool.
    And text field containing products tagged with cool shown.