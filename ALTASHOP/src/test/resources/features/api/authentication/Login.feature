Feature: Login User
  As a user
  I want to login
  So that I can be access

  Background:
    Given I set API endpoint valid for login user

  #ScenarioPositive
  Scenario Outline: As a user I can login with a valid credentials
    When I enter a valid email
    And I enter a valid password
    And I send request to login user "<email>" and "<password>"
    Then I received status code 200 OK login user
    And I received token login user data response
    Examples:
      | email                    | password |
      | miaaprilia2803@gmail.com | test     |

  #ScenarioNegative
  Scenario: As a user I can't login without path
    Given I set API endpoint invalid for login user without the path
    When I send request to login user no path
    Then I received status code 404 Not Found in request to login user
    And I received error message "not found" response

  Scenario: As a user I can't login if I don't fill in the login request
    When I blank the login request
    And I send a request to the login user
    Then I received status code 400 Bad Request in request to login user
    And I received the error message "email is required" response

  Scenario: As a user I can't login if I don't fill in the email request
    When I blank the email request
    And I enter a valid password
    And I sent a request to the login user "<email>" and "<password>"
    Then I received status code 400 Bad Request in request to login user
    And I received the error message "email is required" response

  Scenario: As a user I can't login if I don't fill in the password request
    When I enter a valid email
    And I blank the password request
    And I sent a request to the login user "<email>" and "<password>"
    Then I received status code 400 Bad Request in request to login user
    And I received the error message "password is required" response

  Scenario: As a user I can't login with an invalid email
    When I enter an invalid email
    And I enter a valid password
    And I send request to login user "<email>" and "<password>"
    Then I received status code 400 Bad Request in request login user
    And I received an error message "record not found" response

  Scenario: As a user I can't login with an invalid password
    When I enter a valid email
    And I enter an invalid password
    And I send request to login user "<email>" and "<password>"
    Then I received status code 400 Bad Request in request login user
    And I received an error message "email or password is invalid" response

