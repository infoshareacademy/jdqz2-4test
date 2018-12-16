package com.jdqz2._4test;

import com.jdqz2._4test.pageObjects.ChicVintageDeVilleBagPage;
import com.jdqz2._4test.pageObjects.MainPage;
import com.jdqz2._4test.pageObjects.ShoppingCartPage;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CartTest {
    private static final String PAGE_URL = "http://4test.jdqz2.is-academy.pl/shop";
    private static WebDriver driver;
    private CustomWait customWait;

    private MainPage mainPage;
    private ShoppingCartPage shoppingCartPage;
    private ChicVintageDeVilleBagPage chicVintageDeVilleBagPage;

    @BeforeClass
    public static void setDriver() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
    }

    @Before
    public void setUp() {
        customWait = new CustomWait(driver);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        driver.get(PAGE_URL);
    }

    @Test
    public void AddItemsToCart() throws InterruptedException {
        mainPage.addToCartFirstBagMain();
        mainPage.addToCartSecondBagMain();
        mainPage.addToCartThirdBagMain();
        mainPage.addToCartFourthBagMain();
        mainPage.goToCheckoutMainHoverClick();
        assertTrue(shoppingCartPage.proceedButtonIsDisplayed());
    }

    @Test
    public void AddItemsToCartAndContinueShopping() throws InterruptedException {
        mainPage.addToCartFirstBagMain();
        mainPage.addToCartSecondBagMain();
        mainPage.goToCheckoutMainHoverClick();
        assertTrue(shoppingCartPage.proceedButtonIsDisplayed());
        shoppingCartPage.continueShopping();
        assertTrue(mainPage.featuredItemsTextIsDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
