Feature: Get Order By ID
  As a user
  I want to get order data
  So that I can be get order data

  #Scenario Positive
  Scenario: As a user I can get order by ID data with a valid path
    Given I set API endpoint valid for get order by ID
    When I set the type "Bearer Token" on the authorization tab in get order by ID
    And I enter a valid token order by ID
    And I send request to get order by ID
    Then I received status code of 200 OK for a get order by ID
    And I received data get order by ID response

  #Scenario Negative
  Scenario: As a user I cannot get order data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single order data the path
    When I set the type "Bearer Token" on the authorization tab in get order by ID
    And I enter a valid token order by ID
    And I send request to get a single order data invalid ID
    Then I received status code 404 Not Request in request to get order by ID
    And I received error message "not found" get order by ID response

  Scenario: As a user I cannot get order data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single order data the path
    When I set the type "Bearer Token" on the authorization tab in get order by ID
    And I enter a valid token order by ID
    And I send request to get a single order data invalid ID
    Then I received status code 404 Not Request in request to get order by ID
    And I received error message "record not found" get order by ID response