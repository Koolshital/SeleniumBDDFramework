Feature: Registration feature
  As a user
  I want add registration functionality
  so  that customer can use it
  @RegTest
  Scenario: Validating Registration after adding mandatory fields
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter Firstname and Lastname
    And I enter valid Email
    And I enter password and confirm password
    And I click on Register button
   Then I should see Your Registration completed
   And I should see continue button