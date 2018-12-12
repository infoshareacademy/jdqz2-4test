package com.jdqz2._4test;

import com.jdqz2._4test.pageObjects.MainPage;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTest {
    private static final String PAGE_URL = "http://4test.jdqz2.is-academy.pl/shop";
    private static WebDriver driver;
    private CustomWait customWait;

    private MainPage mainPage;


    @BeforeClass
    public static void setDriver() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
    }

    @Before
    public void setUp() {
        customWait = new CustomWait(driver);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        driver.get(PAGE_URL);
    }

    @Test
    public void AddItemsToCart() {
        mainPage.addToCartFirstBagMain();
        mainPage.addToCartSecondBagMain();
        mainPage.addToCartThirdBagMain();
        mainPage.addToCartFourthBagMain();
        mainPage.goToCheckoutMainHower();
        mainPage.goToCheckoutMainClick();
    }



    @After
    public void tearDown() {
        driver.close();
    }
}
