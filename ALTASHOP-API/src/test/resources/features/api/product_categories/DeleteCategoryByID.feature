Feature: Delete Category By ID
  As a user
  I want to delete category by ID
  So that I can remove single category by ID

  #Scenario Positive
  Scenario: As a user I can delete category by ID data with a valid path
    Given I set API endpoint valid for delete category by ID
    When I send request to delete category by ID
    Then I received status code of 200 OK for a delete category

  #Scenario Negative
  Scenario: As a user I can't delete category by ID with an invalid path
    Given I set API endpoint for delete category by ID with an invalid path
    When I send request to delete category by ID with an invalid path
    Then I received status code 405 Method Not Allowed in request to delete category by ID
    And I received message error "method not allowed" delete category by ID response