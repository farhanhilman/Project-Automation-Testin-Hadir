Feature: Logout

  Scenario: Successful Logout
    Given I am on the login page
    When I am login with valid email and valid password
    And I am on the dashboard page
    And I am logout
    Then I am go to login page
