Feature: Get Product Ratings
  As a user
  I want to get product ratings
  So that I can be get product ratings

  #Scenario Positive
  Scenario: As a user I can get ratings product data with a valid path
    Given I set API endpoint valid for get product ratings
    When I send request to get product ratings
    Then I received status code 200 OK get product ratings
    And I received data rating product

  #Scenario Negative
  Scenario: As a user I can't get product ratings without path
    Given I set API endpoint for get product ratings without the path
    When I send request to get product ratings no path
    Then I received status code 404 Not Found in request to get product ratings
    And I received message error "record not found" get product ratings response