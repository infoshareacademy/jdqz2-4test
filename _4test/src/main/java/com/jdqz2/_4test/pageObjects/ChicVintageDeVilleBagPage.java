package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChicVintageDeVilleBagPage {

    private CustomWait customWait;

    private WebDriver driver;

    public ChicVintageDeVilleBagPage(WebDriver driver) {
        this.driver = driver;
        customWait = new CustomWait(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class = 'btn addToCart addToCartButton btn-buy']")
    private WebElement addToCartButton;



    public void addToCartFromChicBagPage() {
        customWait.waitForElementToBeClickable(addToCartButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addToCartButton);
        addToCartButton.click();
    }

}