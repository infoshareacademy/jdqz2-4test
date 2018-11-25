package com.jdqz2._4test;

import com.jdqz2._4test.pageObjects.MainPage;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ProductsTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        driver.get("http://4test.jdqz2.is-academy.pl/shop/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void buttonsTest(){

        mainPage.buttonsTest;
    }
}
