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

    LoginTestFormData loginData = new LoginTestFormData();
    LoginPage loginPage;




    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        driver.get("http://4test.jdqz2.is-academy.pl/shop/");
        loginPage = new LoginPage(driver);

    }


    @Test
    public void test() {

        loginPage.loginTest(loginData);
        loginPage.assertLoginWasSuccessful();

    }

    @After
    public void tearDown(){

        driver.close();
    }


}
