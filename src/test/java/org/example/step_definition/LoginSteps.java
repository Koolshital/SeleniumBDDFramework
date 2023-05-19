package org.example.step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();
   // DriverManager driverManager = new DriverManager();
    @Then("^I should see \"([^\"]*)\" text$")//its called regex
    public void i_should_see_text(String expectedText) throws Throwable {
       String actualText =  loginPage.getWelcomeText();
       assertEquals(expectedText,actualText);



    }

    @And("^the URL should contain \"([^\"]*)\"$")
    public void theURLShouldContain(String expectedText) throws Throwable {
        String myURL = getURL();
        assertThat(myURL,containsString(expectedText));


    }



    @When("^I enter valid email and valid password$")
    public void iEnterValidEmailAndValidPassword() {
        loginPage.enterEmail();
        loginPage.enterPassword();

    }

    @And("^I click on Login button on login page$")
    public void iClickOnLoginButtonOnLoginPage() {
        loginPage.clickLoginButton();
    }

    @Then("^I should see log out button$")
    public void iShouldSeeButton() throws Throwable {
        loginPage.myLogoutButtonVisible();
        System.out.println("test passed");


    }

    @And("^I should see My Account button$")
    public void iShouldSeeMyAccountButton() {
        loginPage.myAccountButtonVisible();
        System.out.println("test passed");
    }


    // Write code here that turns the phrase above into concrete actions



}
