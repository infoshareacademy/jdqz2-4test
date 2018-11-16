package com.jdqz2._4test;

import com.jdqz2._4test.dataGenerator.LoginTestFormData;
import com.jdqz2._4test.dataGenerator.RegistrationFormData;
import com.jdqz2._4test.pageObjects.LoginPage;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;



public class LoginTest {

    private WebDriver driver;
    private RegistrationFormData registrationFormData;


    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        driver.get("http://4test.jdqz2.is-academy.pl/shop/");

    }

    @Test
    public void test() {


        LoginTestFormData loginData = new LoginTestFormData();
        new LoginPage(driver).loginTest(loginData);

    }

    @After
    public void tearDown(){
        
        driver.close();
    }


}
