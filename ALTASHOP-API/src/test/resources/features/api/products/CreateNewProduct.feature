Feature: Create New Product
  As a user
  I want to create new product
  So that I can be added new product

  Background:
    Given I set API endpoint valid for create new product

  #Scenario Positive
  Scenario: As a user I can create new product data with a valid path and body request
    When I filling a valid body request
    And I send request to create new product valid request
    Then I received status code of 200 OK for a new product
    And I successfully added a new product
    And I received new product data that was successfully added

  #Scenario Negative
  Scenario: As a user I can't create new product without path
    Given I set API endpoint for create new product without the path
    When I send request to create new product no path
    Then I received status code 404 Not Found in request to create new product
    And I received message error "not found" create new product response

  Scenario: As a user I can't create new product data if name field blank request
    When I filled in all valid fill requests but only the name column blank
    And I send request to create new product with name blank
    Then I received status code of 500 Internal Server Error for a new product
    And I received error SQLSTATE 23514 response

  Scenario: As a user I can't create new product data if price field blank request
    When I filled in all valid fill requests but only the price column blank
    And I send request to create new product with price blank
    Then I received status code of 400 Bad Request for a new product
    And I received message error "invalid character" response