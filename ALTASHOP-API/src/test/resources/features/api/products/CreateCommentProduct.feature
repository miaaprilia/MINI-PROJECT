Feature: Create Comment Product
  As a user
  I want to create comment product
  So that I can be added comment product

  Background:
    Given I set API endpoint valid for create comment product
    When I set the type "Bearer Token" on the authorization tab create comment product
    And I enter a valid token comment product
    And I filling a valid body request comment product

  #Scenario Positive
  Scenario: As a user I can create comment product data with a valid path and body request
    And I send request to create comment product
    Then I received status code of 200 OK for a comment product
    And I successfully create comment product
    And I received product comment data that was successfully added

  #Scenario Negative
  Scenario: As a user I can't create comment product with an invalid path
    Given I set API endpoint for create comment product with an invalid path
    And I send request to create comment product with an invalid path
    Then I received status code 404 Not Found in request to comment product
    And I received message error "not found" create comment product response

  Scenario: As a user I can't create comment product data if content field blank request
    Given I set API endpoint for create comment product without the path
    And I left the content column blank
    And I send request to create comment product without the path
    Then I received status code 500 Internal Server Error in request to comment product
    And I received error SQLSTATE 23514 create comment product response