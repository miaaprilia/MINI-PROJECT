Feature: Create New Order
  As a user
  I want to create new order
  So that I can be added new order

  Background:
    Given I set API endpoint valid for create new order
    When I set the type "Bearer Token" on the authorization tab
    And I enter a valid token new order
    And I filling a valid body request

  #Scenario Positive
  Scenario: As a user I can create new order data with a valid path and body request
    And I send request to create new order
    Then I received status code of 200 OK for a new order
    And I successfully added a new order
    And I received new order data that was successfully added

  #Scenario Negative
  Scenario: As a user I can't create new order with an invalid path
    Given I set API endpoint for create new order with an invalid path
    And I send request to create new order with an invalid path
    Then I received status code 404 Not Found in request to create new order
    And I received message error "not found" create new order response

  Scenario: As a user I can't create new order data if content field blank request
    And I blank the create new order request
    And I send request to create new order with blank request
    Then I received status code 400 Bad Request in request to create new order
    And I received message error "invalid character" create new order response
