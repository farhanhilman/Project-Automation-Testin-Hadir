Feature: Login User

  Scenario: Successfull login user with valid credentials
    Given I am on the login page user
    When I enter a valid email and password user
    And I click the submit button user
    Then I should be redirected to the dashboard page user

  Scenario: Failed login user with invalid email
    Given I am on the login page user
    When I enter an invalid email and valid password user
    And I click the submit button user
    Then I should see an error message user

  Scenario: Failed login user with invalid email not input symbol '@'
    Given I am on the login page user
    When I enter an invalid email not input symbol '@' and valid password user
    And I click the submit button user
    Then I should see an error message '@' user

  Scenario: Failed login user with invalid password
    Given I am on the login page user
    When I enter a valid email and invalid password user
    And I click the submit button user
    Then I should see an error message user

  Scenario: Failed login user without input password
    Given I am on the login page user
    When I enter an valid email and not input password user
    And I click the submit button user
    Then I should see an error message user

  Scenario: Failed login user witout input email
    Given I am on the login page user
    When I enter an invalid password without email user
    And I click the submit button user
    Then I should see an error message user

  Scenario: Failed login user without email and password
    Given I am on the login page user
    When I am not input email and password user
    And I click the submit button user
    Then I should see an error message user

