Feature: Assign Product Rating
  As a user
  I want to assign product rating
  So that I can be assign product rating

  Background:
    Given I set API endpoint valid for assign product rating

  #Scenario Positive
  Scenario: As a user I can assign product rating data with a valid path and body request
    When I set the type "Bearer Token" on the authorization tab in assign product rating
    And I enter a valid token product rating
    And I filling a valid body request
    And I send request to assign product rating
    Then I received status code of 200 OK for a product rating
    And I successfully assign product rating
    And I received product rating data that was successfully added

  #Scenario Negative
  Scenario: As a user I can't assign product ratings with an invalid path
    Given I set API endpoint for assign product ratings with an invalid path
    When I set the type "Bearer Token" on the authorization tab in assign product rating
    And I enter a valid token product rating
    And I filling a valid body request
    And I send request to assign product ratings with an invalid path
    Then I received status code 404 Not Found in request to rating product
    And I received message error "not found" assign product ratings response

  Scenario: As a user I can't assign product ratings without path
    Given I set API endpoint for assign product ratings without the path
    When I set the type "Bearer Token" on the authorization tab in assign product rating
    And I enter a valid token product rating
    And I filling a valid body request
    And I send request to assign product ratings no path
    Then I received status code 405 Method Not Allowed in request to rating product
    And I received message error "method not allowed" assign product ratings response

  Scenario: As a user I can't set product rating data with a request for the number of ratings exceeding > 5
    When I set the type "Bearer Token" on the authorization tab in assign product rating
    And I enter a valid token product rating
    And I enter product rating data with a request for the number of ratings exceeding > 5
    And I send request to assign product with more than 5 rating
    Then I received status code 500 Internal Server Error in request to rating product
    And I received error SQLSTATE 23514 assign product ratings response