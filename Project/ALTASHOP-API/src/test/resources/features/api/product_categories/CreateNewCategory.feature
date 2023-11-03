Feature: Create New Category
  As a user
  I want to create new category
  So that I can be added new category

  Background:
    Given I set API endpoint valid for create new category

  #Scenario Positive
  Scenario: As a user I can create new category data with a valid path
    When I filling a valid body request new category
    And I send request to create new category
    Then I received status code of 200 OK for a create new category
    And I successfully added a new category
    And I received new category data that was successfully added

  #Scenario Negative
  Scenario: As a user I can't create new category with an invalid path
    Given I set API endpoint for create new category with an invalid path
    When I filling a valid body request new category
    And I send request to create new category with an invalid path
    Then I received status code 404 Not Found in request to create new category
    And I received message error "not found" create new category response

  Scenario: As a user I can't create new category data if content field blank request
    When I blank the create new category request
    And I send request to create new category with blank request
    Then I received status code 500 Internal Server Error in request to create new category
    And I received message (SQLSTATE 23514) create new category response
