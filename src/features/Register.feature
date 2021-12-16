Feature: feature to test register functionality

  Scenario: Check register is Successful with valid data

    Given user is on register page
    When user enters valid register data
    And click on register button
    Then user is success registration

