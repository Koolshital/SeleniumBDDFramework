package org.nopcommerce.pages;

import org.nopcommerce.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToBasketFromPdpPage extends DriverManager {
   String pdpPageUrl = "https://demo.nopcommerce.com/fahrenheit-451-by-ray-bradbury";
    public void goToPdp(){
        driver.get(pdpPageUrl);
    }

}
