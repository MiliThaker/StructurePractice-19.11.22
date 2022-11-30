Feature: New comment on nopCommerce new release!
  Background: https://demo.nopcommerce.com/
    Given I am on homepage
    When I click on details by nopCommerce new release! menu

  Scenario: As a user I want give new comment on nopCommerce new release! page
            and want to verify that my comment appears at last of the all comment list
    Given I am on nopCommerce new release! page
    When I entre title
    And I entre comment
    And I click on new comment
    And News comment is successfully added
    Then My comment appears at last of all comments