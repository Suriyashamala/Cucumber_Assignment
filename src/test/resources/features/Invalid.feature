Feature: LambdaTest invalid search functionality
  As a user,I want to verify the invalid search functionality
  so that I want to search for a invalid product "xyz0211ss"

  Background:
    When search the product name "xyz0211ss" in the search bar

  Scenario: Verify the invalid search functionality
    Given navigated to the LambdaTest URL
#    When search the product name "xyz0211ss" in the search bar
    And click the "search" button
    And validate the search page indicates no relevant result
    Then take a screenshot of the result page