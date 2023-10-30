Feature: Product
  As a user
  I want to see product list
  So that I can access product page

  #Scenario Positive
  Scenario: As a user who is not logged in, I can't continue ordering the product
    Given I set the endpoint on the home page without login
    When I select 1 or more products on the home page
    And I tap the buy button
    And I tap the cart button at the top right of the page
    And I tap the pay button
    Then I was directed to the login page

  Scenario: As a user who is not logged in, I can continue ordering products by logging in with valid credentials
    Given I set the endpoint on the home page without login
    When I select 1 or more products on the home page
    And I tap the buy button
    And I tap the cart button at the top right of the page
    And I tap the pay button
    And I was directed to the login page
    And I enter valid credentials
    And I tap the login button
    Then I was directed to the transaction page

  Scenario: As a logged in user, I can make product purchases
    Given I set the endpoint on the login page
    When I enter valid credentials
    And I tap the login button
    And User redirect to home page
    And I select 1 or more products on the home page
    And I tap the buy button
    And I tap the cart button at the top right of the page
    And I tap the pay button
    Then I was directed to the transaction page

  Scenario: As a user I can see product detail page
    Given I set the endpoint on the home page without login
    When I select 1 or more products on the home page
    And I tap the detail button
    Then I was directed to the product detail page

  Scenario: As a user I can be rating product in details page
    Given I set the endpoint on the home page without login
    When I select 1 or more products on the home page
    And I tap the detail button
    And I rating in arrange 1 star symbol
    And I rating in arrange 2 star symbol
    And I rating in arrange 3 star symbol
    And I rating in arrange 4 star symbol
    And I rating in arrange 5 star symbol
    Then I can see the submitted ratings

  Scenario: As a user I can add and remove products to the cart
    Given I set the endpoint on the home page without login
    When I select 1 or more products on the home page
    And I tap the buy button
    And I tap the cart button at the top right of the page
    And I added and then remove products from the cart
    Then I see message appear "Order is empty!" in order page

