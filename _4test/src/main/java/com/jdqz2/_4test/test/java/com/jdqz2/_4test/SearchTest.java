package com.jdqz2._4test.test.java.com.jdqz2._4test;
import com.jdqz2._4test.utils.driver.WebDriverCreators;
import com.jdqz2._4test.utils.driver.WebDriverProvider;
import org.junit.Before;
import org.openqa.selenium.WebDriver;





public class SearchTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();
        driver.get("http://4test.jdqz2.is-academy.pl/shop");


    }




}


