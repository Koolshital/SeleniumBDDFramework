package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks extends DriverManager {
   // DriverManager driverManager = new DriverManager();
   @Before
    public void setup() throws IllegalAccessException {
        openLocalBrowser();
        maximiseBrowser();
        openURL();
        applyImplicitWait();


    }
//    @After

//    public void teardown() {
//        closeBrowser();

   // }
}