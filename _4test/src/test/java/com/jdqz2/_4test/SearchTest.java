package com.jdqz2._4test;
import com.jdqz2._4test.pageObjects.LoginPage;
import com.jdqz2._4test.pageObjects.MainPage;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchTest {

    private WebDriver driver;
    private MainPage mainPage;


    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        driver.get("http://4test.jdqz2.is-academy.pl/shop");
        mainPage = new MainPage(driver);

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void searchFieldTest() {
        mainPage.search("");







    }


}


