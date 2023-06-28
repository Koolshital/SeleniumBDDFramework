package org.nopcommerce.step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.nopcommerce.pages.Registration1Page;

import static org.junit.Assert.assertTrue;

public class Registration1Steps {
    Registration1Page registration1Page = new Registration1Page();
    @Given("^I am on Registration page$")
    public void i_am_on_Registration_page() throws Throwable {
        registration1Page.clickRegisterLink();
    }

   // @When("^I select gender female$")
    //public void i_select_gender_female() throws Throwable {
      //  registration1Page.clickGender();

   // }

    @When("^I enter first name$")
    public void i_enter_first_name() throws Throwable {
       registration1Page.enterFirstName();
    }

    @When("^I enter last name$")
    public void i_enter_last_name() throws Throwable {
       registration1Page.enterLastName();
    }

    @When("^I select day,month and year in date of birth$")
    public void i_select_day_month_and_year_in_date_of_birth() throws Throwable {
       registration1Page.enterDob();
    }

    @When("^I enter valid email$")
    public void i_enter_valid_email() throws Throwable {
       registration1Page.enterEmail();
    }

    @When("^I enter company name$")
    public void i_enter_company_name() throws Throwable {
       registration1Page.enterCompany();
    }

    @When("^I check on newsletter box$")
    public void i_check_on_newsletter_box() throws Throwable {
       registration1Page.checkNewsletter();
    }

    @When("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
       registration1Page.enterPassword();
    }

    @When("^I enter valid confirm password$")
    public void i_enter_valid_confirm_password() throws Throwable {
      registration1Page.enterConfirmPassword();
    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
       registration1Page.clickRegister();
    }

    @Then("^I should see registration completed$")
    public void i_should_see_registration_completed() throws Throwable {
        boolean answer = registration1Page.displayRegister();
        assertTrue(answer);

    }


    @When("^I select gender \"([^\"]*)\"$")
    public void iSelectGender(String gender) throws Throwable {
        registration1Page.chooseGender(gender);

    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String arg0) throws Throwable {

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String arg0) throws Throwable {

    }

    @And("^I select \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" in date of birth$")
    public void iSelectAndInDateOfBirth(String arg0, String arg1, String arg2) throws Throwable {

    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String arg0) throws Throwable {

    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String arg0) throws Throwable {

    }

    @And("^I enter valid confirm password \"([^\"]*)\"$")
    public void iEnterValidConfirmPassword(String arg0) throws Throwable {

    }
}
