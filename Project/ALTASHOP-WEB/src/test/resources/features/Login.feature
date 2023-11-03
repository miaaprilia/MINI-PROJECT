Feature: Login
  As a user
  I want to login
  So that I can access product page

  Background:
    Given I set the endpoint on the login page

  #Scenario Positive
  Scenario: As a user I can login with a valid credentials
    When I enter valid email
    And I enter valid password
    And I tap login button
    Then User redirect to home page

  #Scenario Negative
  Scenario: As a user I can't login if I don't fill in the login request
    When I blank form login
    And I tap login button
    Then I see error message appear "email is required" in login page

  Scenario: As a user I can't login if I don't fill in the email request
    When I blank email in login page
    And I enter valid password
    And I tap login button
    Then I see error message appear "email is required" in login page

  Scenario: As a user I can't login if I don't fill in the password request
    When I enter valid email
    And I blank password in login
    And I tap login button
    Then I see error message appear "password is required" in login page

  Scenario: As a user I can't login with an invalid email
    When I enter invalid email
    And I enter valid password
    And I tap login button
    Then I see error message appear "record not found" in login page

  Scenario: As a user I can't login with an invalid password
    When I enter valid email
    And I enter invalid password
    And I tap login button
    Then I see error message appear "email or password is invalid" in login page

  Scenario: As a user I can't log in with an account that is not registered in the database
    When I enter unregistered email
    And I enter a password that has not been registered
    And I tap login button
    Then I see error message appear "record not found" in login page
