Feature: Add to cart buttons on Camera & Photo products
  Background: https://demo.nopcommerce.com/
    Given I am on homepage
    When I click on Electronics menu
    Then I click on Camera & photo menu

    Scenario: I want to verify that all the Camera & Photo products should have add to cart button
      Given I am on Camera & Photo page
      And I should three products
      Then I should see all the products have add to cart button