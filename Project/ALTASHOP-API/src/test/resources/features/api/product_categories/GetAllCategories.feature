Feature: Get All Categories
  As a user
  I want to get all categories
  So that I can read all categories

  #Scenario Positive
  Scenario: As a user I can get all categories data with a valid path
    Given I set API endpoint valid for get all categories
    When I send request to get all categories
    Then I received status code of 200 OK for a get all categories
    And I received list data category response

  #Scenario Negative
  Scenario: As a user I can't get all categories with an invalid path
    Given I set API endpoint for get all categories with an invalid path
    When I send request to get all categories with an invalid path
    Then I received status code 404 Not Found in request to get all categories
    And I received message error "not found" get all categories response