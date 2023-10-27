Feature: LambdaTest search functionality
  As a user,I want to verify search functionality
  so that I want to search a product "camera"

  Background:
    Then take a screenshot of the product details page

  Scenario: Verify the search functionality
    Given navigated to the LambdaTest URL
    When enter the product name "camera"
    And click the "search" button
    And wait for the page to load
#    Then take a screenshot of the product details page
    Then validate the displayed screenshot page belong to the selected loaded page

