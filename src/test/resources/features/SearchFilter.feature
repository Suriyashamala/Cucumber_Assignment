Feature: LambdaTest search functionality
  As a user,I want to verify search functionality
  so that I want to search a product "iphone"

  Scenario: Verify the search functionality
    Given navigated to the LambdaTest URL
    When enter the product name "iphone" in the search bar
    And click the "search" button
    And wait for the page to load
    Then click the filter option
    And choose the "Tablets" from the given filter option
    And wait for the page to load
    Then validate the displayed product belong to the selected option



