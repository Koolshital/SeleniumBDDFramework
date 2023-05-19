package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {
    @FindBy(xpath = "//a[@class=\"ico-register\"]")
    WebElement registerHomePage;
    @FindBy(id = "FirstName")
    WebElement nameBox;
    public String firstName= "Shital";
    @FindBy(id ="LastName")
    WebElement surnameBox;
    public String lastName ="Dalal";

    @FindBy(id = "Email")
    WebElement emailIdBox;
    public String email = "koolshitalda@yahoo.com";
    @FindBy(xpath = "//input[@id=\"Password\"]")
    WebElement regPasswordBox;
    public String password = "1234567";
    @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
    WebElement confirmPasswordBox;
    public String confirmPassword = "1234567";
    @FindBy(id = "register-button")
    WebElement registerButton;
    @FindBy(xpath = "//div[@class=\"result\"]")
    WebElement regSucess;
    @FindBy(className = "register-continue-button")
    WebElement continueButton;

    public void clickRegister(){
        registerHomePage.click();
    }
    public void enterFirstName(){
        nameBox.click();
        nameBox.sendKeys(firstName);
    }

    public void enterLastName(){
        surnameBox.click();
        surnameBox.sendKeys(lastName);
    }

    public void enterEmail(){
        emailIdBox.click();
        emailIdBox.sendKeys(email);
    }

    public void enterRegPassword(){
        regPasswordBox.click();
        regPasswordBox.sendKeys(password);
    }

    public void enterConfirmPassword(){
        confirmPasswordBox.click();
        confirmPasswordBox.sendKeys(confirmPassword);
    }
    public void clickRegButton(){
        registerButton.click();
    }
    public boolean checkRegistrationDone(){
       return regSucess.isDisplayed();



    }
    public boolean isContinueVisible(){
        return continueButton.isDisplayed();

    }
}
