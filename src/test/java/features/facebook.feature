Feature: Return from facebook window to main window(multiple window handling)
  Background: https://demo.nopcommerce.com/
    Given I am on homepage

  Scenario: I should be able to open facebook page window and return to main window successfully
    Given I click on facebook symbol
    When I should be on facebook window succesfully
    And I should see that facebook window closing succesfully
    Then I should be abld to return to main window successfully