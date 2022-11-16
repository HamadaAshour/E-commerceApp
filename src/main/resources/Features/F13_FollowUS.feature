@smoke
# Test Scenario Follow us page feature
Feature: logged users could open followUs links
  Background: user opens chrome browser.

  Scenario: user could open facebook link
    When user click on facebook icon
    Then "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user could open twitter link
    When user click on twitter icon
    Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user could open youtube link
    When user click on youtube icon
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab

  Scenario: user could open rss link
    When user click on rss icon
    Then "https://www.rss.com/user/nopCommerce" is opened in new rss tab

