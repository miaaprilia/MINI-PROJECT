Feature: Get Product Comments
  As a user
  I want to get product comments
  So that I can be get product comments

  #Scenario Positive
  Scenario: As a user I can get product comments data with a valid path
    Given I set API endpoint valid for get product comments
    When I send request to get product comments
    Then I received status code 200 OK get product comments
    And I received data comment product

  #Scenario Negative
  Scenario: As a user I can't get product comments without path
    Given I set API endpoint for get product comments without the path
    When I send request to get product comments no path
    Then I received status code 404 Not Found in request to get product comments
    And I received message error "record not found" get product comments response