Feature: Hello
  As a user
  I want to see index data
  So that I can read index data

  #Scenario Positive
  Scenario: As a user I can index data with a valid path and body request
    Given I set API endpoint valid for index
    When I send request to index
    Then I received status code of 200 OK for a index
    And I received data message "hello" index response

  #Scenario Negative
  Scenario: As a user I can't index with an invalid path
    Given I set API endpoint for index with an invalid path
    When I send request to index with an invalid path
    Then I received status code 404 Not Found in request to index
    And I received message error "not found" index response