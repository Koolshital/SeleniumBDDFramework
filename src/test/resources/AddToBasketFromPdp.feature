Feature: Add to cart functionality
  As a user
  I want to add product to shopping cart
  So customer can use it
  @ATB2
  Scenario: Validating add to basket functionality from PDP
    Given I am on product description page
    And I check initial basket  item quantity in header
    When I click on add to cart button from PDP
    Then I should see the item is added to the cart
