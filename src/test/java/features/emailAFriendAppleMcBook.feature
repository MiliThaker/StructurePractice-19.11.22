Feature: Email a friend to refere a Apple MacBook Pro 13-inch
  Background: https://demo.nopcommerce.com/
    Given I am on homepage
    When I click on Apple MacBook Pro 13-inch

    Scenario: As a registered user I want to email a friend to refere Apple MacBook Pro 13-inch successfully
      Given  I am on Apple MacBook Pro 13-inch page
      When I click on email a friend
      And I entre freind's email
      And I entre personal comment
      And I click on send email button
      Then I should be able to send email successfully
