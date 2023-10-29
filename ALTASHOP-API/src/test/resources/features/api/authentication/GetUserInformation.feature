Feature: Get User Information
  As a user
  I want to get user information
  So that I can see user information

  #Scenario Positive
  Scenario: As a user I can get user information with valid token data
    Given I set a valid API endpoint to get user information
    When I set the type "Bearer Token" on the authorization tab in user information
    And I enter a valid token user information
    And I send a request to get user information
    Then I received status code of 200 OK get user information
    And I received user information data response

  #Scenario Negative
  Scenario: As a user I can't get user information without path
    Given I set API endpoint invalid for get user information user without the path
    When I set the type "Bearer Token" on the authorization tab in user information
    And I enter a valid token user information
    And I send a request without path to get user information
    Then I received status code 404 Not Found in request to get user information
    And I received error message "not found" response

  Scenario: As a user I can't get user information without token
    Given I set a valid API endpoint to get user information
    When I set the type "Bearer Token" on the authorization tab in user information
    And I blank the token request Get User Information
    And I send a request without token to get user information
    Then I received status code 401 Unauthorized in request to get user information
    And I received the error message "unauthorized" response

  Scenario: As a user I can't get user information invalid token
    Given I set a valid API endpoint to get user information
    When I set the type "Bearer Token" on the authorization tab in user information
    And I enter invalid token
    And I send a request invalid token to get user information
    Then I received status code 401 Unauthorized in request to get user information
    And I received the error message "signature is invalid" response

  Scenario: As a user I can't get user information if setting authorization type other than "Bearer Token"
    Given I set a valid API endpoint to get user information
    When I set the type "Bearer Token" on the authorization tab in user information
    And I enter a valid token user information
    And I send a request type other than "Bearer Token" to get user information
    Then I received status code 401 Unauthorized in request to get user information
    And I received the error message "unauthorized" response
