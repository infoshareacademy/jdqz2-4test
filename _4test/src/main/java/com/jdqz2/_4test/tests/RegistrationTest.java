package com.jdqz2._4test.tests;

import com.jdqz2._4test.pageObjects.RegistrationPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {

    private WebDriver driver;

    private RegistrationPage registrationPage;

    @Before
    public void setUp(){
        driver = new WebDriverProvider(WebDriverCreators)
    }

}
