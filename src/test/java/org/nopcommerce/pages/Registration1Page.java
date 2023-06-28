package org.nopcommerce.pages;

import org.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration1Page extends DriverManager {
    @FindBy(xpath = "//a[@class=\"ico-register\"]")
    WebElement regLink;
  // @FindBy(id="gender-female")
   // WebElement genderCheck;
    @FindBy(xpath = "//input[@id=\"gender-male\"]")
    WebElement genderMale;
    @FindBy(xpath = "//input[@id=\"gender-female\"]")
    WebElement genderFemale;
    @FindBy(id ="FirstName")
    WebElement firstNameEntry;
    @FindBy(id ="LastName")
    WebElement lastNameEntry;
    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
    WebElement dateSelect;
    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
    WebElement monthSelect;
    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
    WebElement yearSelect;
    @FindBy(xpath = "//input[@id=\"Email\"]")
    WebElement emailEntry;
    @FindBy(xpath = "//input[@id=\"Company\"]")
    WebElement companyEntry;
    @FindBy(xpath =  "//input[@id=\"Newsletter\"]")
    WebElement newsletterCheck;
    @FindBy(xpath = "//input[@id=\"Password\"]")
    WebElement passwordEntry;
    @FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
    WebElement confirmPasswordEntry;
    @FindBy(xpath = "//button[@id=\"register-button\"]")
    WebElement registerButton;
    @FindBy(xpath ="//div[@class=\"result\"]")
    WebElement successRegistration;
   /* public void clickGender(){
        genderCheck.click();
    }*/
    public void chooseGender(String gender){
        if (gender.contains("Male")){
            genderMale.click();

        }else if(gender.contains("Female")){
            genderFemale.click();
        }
    }
    public void clickRegisterLink(){
        regLink.click();

    }
    public void enterFirstName(){
        firstNameEntry.clear();
        firstNameEntry.sendKeys("Shital");

    }
    public void enterLastName(){
        lastNameEntry.clear();
        lastNameEntry.sendKeys("Dalal");
    }
    public void enterDob(){
        Select select = new Select(dateSelect);
        select.selectByValue("16");
        Select select1 =new Select(monthSelect);
        select1.selectByVisibleText("March");
        Select select2 = new Select(yearSelect);
        select2.selectByValue("1980");
    }
    public void enterEmail(){
        emailEntry.clear();
        emailEntry.sendKeys("coolShital@abc.com");

    }
    public void enterCompany(){
        companyEntry.clear();
        companyEntry.sendKeys("Resourcewise");
    }
    public void checkNewsletter(){
        newsletterCheck.click();
    }
    public void enterPassword(){
        passwordEntry.clear();
        passwordEntry.sendKeys("12345678");
    }
    public void enterConfirmPassword(){
        confirmPasswordEntry.clear();
        confirmPasswordEntry.sendKeys("12345678");
    }
    public void clickRegister(){
        registerButton.click();
    }
    public boolean displayRegister(){
        return successRegistration.isDisplayed();

    }
    public void chooseGender(){



    }
    public void enterFirstName1(String firstName1){
        firstNameEntry.clear();
        firstNameEntry.sendKeys("firstName1");

    }
    public void enterLastName1(String lastName1){
        lastNameEntry.clear();
        lastNameEntry.sendKeys("lastName1");
    }
    public void enterDob1(int date,String month,int year){
        Select select = new Select(dateSelect);
        select.selectByIndex(date);
        Select select1 = new Select(monthSelect);
        select1.selectByVisibleText(month);
        Select select2 = new Select(yearSelect);
        String year1 = Integer.toString(year);//integer converted in string by this predefined method
        select2.selectByVisibleText(year1);

    }
    public void enterEmail1(String email){
        emailEntry.clear();
        emailEntry.sendKeys("email");
    }
    public void enterCompany1(String company){
        companyEntry.clear();
        companyEntry.sendKeys(company);
    }
    public void enterPassword1(String password){
        passwordEntry.clear();
        passwordEntry.sendKeys("password");
    }
    public void enterConfirmPassword1(String confirmPassword){
        confirmPasswordEntry.clear();
        confirmPasswordEntry.sendKeys("confirmPassword");
    }
}

