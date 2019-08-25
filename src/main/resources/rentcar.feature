Feature: rent car

  As a user, I want to rent car

  Scenario: page rent car offers default login
    Given User is on offers car rent page
    And user complete table phone, name, massage
    When user click button Contact
    Then user have information on page that massage is send
