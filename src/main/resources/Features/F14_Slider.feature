@smoke
  #this scenario fails is when we press on the slider it doesn't take us to the product page it just stays in the home page
Feature: users will be able to open sliders in home page
  Background: user opens browser.
    And go to home page.


  Scenario: first slider is clickable on home page
    When click on first slider
    Then relative product for first slider is displayed


  Scenario: second slider is clickable on home page
    When click on second slider
    Then relative product for second slider is displayed
