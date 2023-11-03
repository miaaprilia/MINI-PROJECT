Feature: Register User
  As a user
  I want to register
  So that I can be login

  Background:
    Given I set the endpoint on the register page

  #Scenario Positive
  Scenario: As a new user I can register by filling in valid data
    When I enter fullname
    And I enter a valid email format
    And I enter password
    And I tap register button
    Then User redirect to login page

  #Scenario Negative
  Scenario: As a new user I can't register if I don't fill in the register request
    When I blank form register
    And I tap register button
    Then I see error message appear "email is required" in register page

  Scenario: As a new user I can't register if I don't fill in the fullname request
    When I blank fullname in register page
    And I enter a valid email format
    And I enter password
    And I tap register button
    Then I see error message appear "fullname is required" in register page

  Scenario: As a new user I can't register if I don't fill in the email request
    When I enter fullname
    And I blank email in register page
    And I enter password
    And I tap register button
    Then I see error message appear "name is required" in register page

  Scenario: As a new user I can't register if I don't fill in the password request
    When I enter fullname
    And I enter a valid email format
    And I blank password in register page
    And I tap register button
    Then I see error message appear "password is required" in register page

  Scenario: As a new user I can't register if the email request format is not appropriate (e.g.: missing @)
    When I enter fullname
    And I enter email invalid format
    And I enter password
    And I tap register button
    Then I see error message appear "unknown email format" in register page
