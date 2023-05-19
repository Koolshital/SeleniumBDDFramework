package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {//this is the utility ,we will keep reusable methods here
    public static WebDriver driver;
    String browser = "chrome";
    String baseURL ="https://demo.nopcommerce.com/";
    public DriverManager(){//intialising constructor ??
        PageFactory.initElements(driver,this);//calling object(driver) in this class\page
        //this is predefined class and method
    }

    public void openLocalBrowser() throws IllegalAccessException {//using conditional statement to open in diff browsers
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
//            case "edge":
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//                break;
//            case "safari":
//                WebDriverManager.operadriver().setup();
//                driver = new OperaDriver();
//                break;
                default:
                throw new IllegalAccessException("unexpected browser");//to make sure to open mentioned browser

        }
    }
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
    public void openURL(){
        driver.get(baseURL);
    }
    public String getURL(){//to validate that right url has been opened in the browser
        return driver.getCurrentUrl();

    }
}
