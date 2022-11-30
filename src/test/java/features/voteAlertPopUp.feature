Feature: Vote's alert pop up window handling
  Background: https://demo.nopcommerce.com/
    Given I am on homepage

    Scenario: I should be able to accept and handle alert pop up successfully
      Given I click on vote
      When I should see alert pop up window open with accept button
      And I should click on ok button to accept alert message
      And I can close the alert pop window successfully
      Then I should be on homepage successfully and able to use all the fuctionlity
