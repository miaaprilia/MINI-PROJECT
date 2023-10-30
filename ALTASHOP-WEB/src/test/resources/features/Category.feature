Feature: Category
  As a user
  I want to see select category
  So that I can see product based on category

  Background:
    Given I set the endpoint on the home page without login

  #Scenario Positive
  Scenario: As a user I can select products based on the categories that contain product items
    When I select the category
    And I tap that contains product items on the home page
    Then I view products based on the selected category

  #Scenario Negative
  Scenario: As a user I can select products based on categories that do not contain product items
    When I selected a category
    And I tap that does not contain product items on the home page
    Then I see the message appear "Products are empty!" in order page
    And I don't see products based on the selected category