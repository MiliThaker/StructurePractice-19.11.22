Feature: Curruncy symbol
  Background: https://demo.nopcommerce.com/
    Given I am on homepage

    Scenario: I should see currunt currancy symbol presrent on all the products on homeage
      Given I should see currancy selector is present on top rigt side of the homepage
      When I should see currancy symbol present
      Then I should see same curruncy symbol with all the prducts as the symbol present in top right on home page
