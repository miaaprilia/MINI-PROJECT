Feature: Get All Orders
  As a user
  I want to get all orders
  So that I can read all orders

  #Scenario Positive
  Scenario: As a user I can get all orders data with a valid path
    Given I set API endpoint valid for get all orders
    When I set the type "Bearer Token" on the authorization tab in get all order
    And I enter a valid token
    And I send request to get all orders
    Then I received status code of 200 OK for a get all orders
    And I received list data get all orders response

  #Scenario Negative
  Scenario: As a user I can't get all orders with an invalid path
    Given I set API endpoint for get all orders with an invalid path
    When I set the type "Bearer Token" on the authorization tab in get all order
    And I enter a valid token
    And I send request to get all orders with an invalid path
    Then I received status code 404 Not Found in request to get all orders
    And I received message error "not found" get all orders response