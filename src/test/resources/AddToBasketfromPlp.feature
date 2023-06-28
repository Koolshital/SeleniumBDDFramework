Feature:Add product to a basket funtionality
  As a user
  I want to add product to a shopping cart
  So customer can use it
@ATB1
  Scenario: Validating add to basket funtionality
    Given I am on Homepage
    And I click on "Books" category
    And I check initial basket  item quantity in header
    When I click on Add to cart button for item 1 from PLP
    Then I should see the item is added to the cart



