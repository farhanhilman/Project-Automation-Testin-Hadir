Feature: Login

  Scenario: Successfull login with valid credentials
    Given I am on the login page
#    When I enter a valid email and password
    And I click the submit button
    Then I should be redirected to the dashboard page

#  Scenario: Failed login with invalid email
#    Given I am on the login page
#    When I enter an invalid email and valid password
#    And I click the submit button
#    Then I should see an error message
#
#  Scenario: Failed login with invalid email not input symbol '@'
#    Given I am on the login page
#    When I enter an invalid email not input symbol '@' and valid password
#    And I click the submit button
#    Then I should see an error message
#
#  Scenario: Failed login with invalid password
#    Given I am on the login page
#    When I enter a valid email and invalid password
#    And I click the submit button
#    Then I should see an error message
#
#  Scenario: Failed login without input password
#    Given I am on the login page
#    When I enter an valid email and not input password
#    And I click the submit button
#    Then I should see an error message
#
#  Scenario: Failed login witout input email
#    Given I am on the login page
#    When I enter an invalid password without email
#    And I click the submit button
#    Then I should see an error message
#
#
#  Scenario: Failed login without email and password
#    Given I am on the login page
#    When I am not input email and password
#    And I click the submit button
#    Then I should see an error message
#
