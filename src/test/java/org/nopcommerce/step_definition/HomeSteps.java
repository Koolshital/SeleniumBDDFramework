package org.nopcommerce.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.nopcommerce.driver.DriverManager;
import org.nopcommerce.pages.HomePage;


import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomeSteps extends DriverManager {
    HomePage homePage = new HomePage();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() throws Throwable {
        String myURL = getURL();
        assertThat(myURL,is(endsWith("nopcommerce.com/")));

        // Write code here that turns the phrase above into concrete actions

    }
    @When("^I click on Login button on homepage$")
    public void i_click_on_Login_button_on_homepage() throws Throwable {
        homePage.clickLoginButton();
        // Write code here that turns the phrase above into concrete actions

    }
}


