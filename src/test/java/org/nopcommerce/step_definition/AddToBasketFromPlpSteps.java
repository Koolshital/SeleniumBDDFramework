package org.nopcommerce.step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.nopcommerce.driver.DriverManager;
import org.nopcommerce.pages.AddToBasketFromPlpPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AddToBasketFromPlpSteps extends DriverManager {
    AddToBasketFromPlpPage addToBasketPage = new AddToBasketFromPlpPage();
    String cartQty1;
    @And("^I click on \"([^\"]*)\" category$")
    public void iClickOnCategory(String category) throws Throwable {
        addToBasketPage.openAnyCategory(category);
    }

    @And("^I check initial basket  item quantity in header$")
    public void iCheckInitialBasketItemQuantityInHeader() {
        cartQty1 = addToBasketPage.readCartItemQuantity();
    }

    @When("^I click on Add to cart button for item (\\d+) from PLP$")
    public void iClickOnAddToCartButtonForItemFromPLP(int itemNumber) throws InterruptedException {
        addToBasketPage.addSelectedItem(itemNumber);
        sleepBrowser(600);

    }
    @Then("^I should see the item is added to the cart$")
    public void iShouldSeeItHasAddedToShoppingCartWithQuantity() throws Throwable {
        String cartQty2 = addToBasketPage.readCartItemQuantity();
        System.out.println(cartQty1 + " " + cartQty2);
        assertNotEquals(cartQty2,cartQty1);
    }





}
