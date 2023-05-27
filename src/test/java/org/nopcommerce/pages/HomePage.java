package org.nopcommerce.pages;

import org.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    //package pages also called page object model.
    //it has different pages which contains loacators,variables and methods(actions) as per page
   @FindBy(css =".ico-login")
   public WebElement loginButton;
   public void clickLoginButton(){
       loginButton.click();

   }
}
