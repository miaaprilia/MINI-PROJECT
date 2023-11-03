@Register
Feature: Register User
  As a user
  I want to register
  So that I can be login

  Background:
    Given I set API endpoint valid for register new user

  #Scenario Positive
  Scenario: As a new user I can register by filling a valid data
    When I enter a valid email format
    And I enter password
    And I enter fullname
    And I send request to register user
    Then I received status code 200 OK register user
    And I received register user data response

  #Scenario Negative
  Scenario: As a new user I can't register without path
    Given I set API endpoint invalid for register user without the path
    When I send request to register user
    Then I received status code 404 Not Found in request to register user
    And I received error message "not found" response Register

  Scenario: As a new user I can't register if I don't fill in the register request
    When I blank the register request Register
    And I send request to register user
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "email is required" register response

  Scenario: As a new user I can't register if I don't fill in the email request
    When I blank the email request Register
    And I enter password
    And I enter fullname
    And I send request to register user
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "email is required" register response

  Scenario: As a new user I can't register if I don't fill in the password request
    When I enter a valid email format
    And I blank the password request Register
    And I enter fullname
    And I send request to register user
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "password is required" register response

  Scenario: As a new user I can't register if I don't fill in the fullname request
    When I enter a valid email format
    And I enter password
    And I blank the fullname request Register
    And I send request to register user
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "fullname is required" register response

  Scenario: As a new user I can't register if the email request format is not appropriate (e.g.: missing @)
    When I enter email invalid format
    And I enter password
    And I enter fullname
    And I send request to register user
    Then I received status code 400 Bad Request in request to register user
    And I received the error message "unknown email format" response
