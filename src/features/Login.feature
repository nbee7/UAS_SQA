Feature: feature to test login functionality

  Scenario: Check login is Successful with valid credintials

    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then user is navigated to the home page

