Feature: LambdaTest search functionality
  As a user,I want to verify search functionality
  so that I want to search a product "iphone"

  Background:
    And click the "search" button

  Scenario: Verify the search functionality
    Given navigated to the LambdaTest URL
    When enter the product name "iphone" in the search bar
#    And click the "search" button
    And wait for the page to load
    Then close the browser
