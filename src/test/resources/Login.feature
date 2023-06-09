
@Test
Feature: Login feature
  As a user
  I want to add login functionality
  So that customer can use it

@Test1
  Scenario: Validating Sign in text on login page
   Given I am on Homepage
   When I click on Login button on homepage
   Then I should see "Welcome, Please Sign In!" text
   And the URL should contain "/login"

@Test2
 Scenario: Login with valid credentials
    Given I am on Homepage
    And I click on Login button on homepage
    When I enter valid email and valid password
    And I click on Login button on login page
    Then I should see log out button
    And I should see My Account button

  
  Scenario: Login with invalid credentials
    Given I am on Homepage
    And I click on Login button on homepage
    When I enter invalid credentials
    Then I should see Error messeage "Login was unsuccessful. Please correct the errors and try again.No customer account found"

# given is precondition,when is action and then is validation

