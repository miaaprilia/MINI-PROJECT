Feature: Get Category By ID
  As a user
  I want to get category data
  So that I can be get category data

  #Scenario Positive
  Scenario: As a user I can get category by ID data with a valid path
    Given I set API endpoint valid for get category by ID
    When I send request to get category by ID
    Then I received status code of 200 OK for a get category by ID
    And I received data category by ID response

  #Scenario Negative
  Scenario: As a user I cannot get category data with an invalid ID (by entering the ID numbers, letters & symbols at the same time)
    Given I set API endpoint invalid for get a single category data the path
    When I send request to get a single category data invalid ID
    Then I received status code 404 Not Found in request to get category by ID
    And I received error message "not found" get category by ID response

  Scenario: As a user I can't get category data with an invalid ID (by entering an ID number that does not yet exist in the database)
    Given I set API endpoint invalid for get a single category data the path
    When I send request to get a single category data invalid ID
    Then I received status code 404 Not Found in request to get category by ID
    And I received message error "record not found" get category by ID response
