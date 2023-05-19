package org.example.step_definition;
//Steo-defination makes connection betn feature file and pages(java file)
/*Stepdefination is link betn feature fil(where testing steps are written)
and page (where all locators and methods(actions) are written to do action).so we can run the test
It works as glue
 */

import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

public class RegistrationSteps extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();
}

