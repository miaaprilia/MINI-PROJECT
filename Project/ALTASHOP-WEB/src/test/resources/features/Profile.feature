Feature: Profile
  As a user
  I want to see history transaction
  So that I can see history transaction dan I can logout

  Background:
    Given I set the endpoint on the login page

  #Scenario Positive
  Scenario: As a logged in user, I can view transaction history
    When I enter valid credentials
    And I tap the login button
    And I tap the profile button
    And I tap the transaction button
    Then I see the transaction history list

  Scenario: As a logged in user, I can view transaction history by setting page rows
    When I enter valid credentials
    And I tap the login button
    And I tap the profile button
    And I tap the transaction button
    And I tap the rows button
    And I set 5 rows per page
    And I set 10 rows per page
    And I set 15 rows per page
    And I organize all rows per page
    Then I see a list of transaction history per rows

  Scenario: As a logged in user, I can view transaction history based on pagination
    When I enter valid credentials
    And I tap the login button
    And I tap the profile button
    And I tap the transaction button
    And I tapped the pagination to the right
    And I tapped the pagination to the left
    Then I see a list of transaction history per page

  Scenario: As a logged in user, I can log out of my Alta Shop account
    When I enter valid credentials
    And I tap the login button
    And I tap the profile button
    And I tap the logout button
    Then I was redirected to the login page