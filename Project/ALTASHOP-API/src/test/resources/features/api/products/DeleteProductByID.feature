Feature: Delete Product By ID
  As a user
  I want to delete product by ID
  So that I can remove single product by ID

  #Scenario Positive
  Scenario: As a user I can delete product by ID data with a valid path
    Given I set API endpoint valid for delete product by ID
    When I send request to delete product by ID
    Then I received status code of 200 OK for a delete product
    And I received data message "null" delete product by ID response

  #Scenario Negative
  Scenario: As a user I can't delete product by ID with an invalid path
    Given I set API endpoint for delete product by ID with an invalid path
    When I send request to delete product by ID with an invalid path
    Then I received status code 405 Method Not Allowed in request to delete product
    And I received message error "method not allowed" delete product by ID response