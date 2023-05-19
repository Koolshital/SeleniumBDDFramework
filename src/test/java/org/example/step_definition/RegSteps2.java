package org.example.step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.RegistrationPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegSteps2 {
    RegistrationPage registrationPage = new RegistrationPage();
    @When("^I click on Register button on homepage$")
    public void iClickOnRegisterButtonOnHomepage() {
        registrationPage.clickRegister();
    }

    @And("^I enter Firstname and Lastname$")
    public void iEnterFirstnameAndLastname() {
        registrationPage.enterFirstName();
        registrationPage.enterLastName();
    }

    @And("^I enter valid Email$")
    public void iEnterValidEmail() {
        registrationPage.enterEmail();
    }

    @And("^I enter password and confirm password$")
    public void iEnterPasswordAndConfirmPassword() {
        registrationPage.enterRegPassword();
        registrationPage.enterConfirmPassword();
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        registrationPage.clickRegButton();
    }

    @Then("^I should see Your Registration completed$")
    public void iShouldSeeRegistrationCompleted() {
        boolean check = registrationPage.checkRegistrationDone();
        assertTrue(check);

    }

    @And("^I should see continue button$")
    public void iShouldSeeContinueButton() {
        boolean check = registrationPage.isContinueVisible();
        assertEquals(true,check);


    }
}
