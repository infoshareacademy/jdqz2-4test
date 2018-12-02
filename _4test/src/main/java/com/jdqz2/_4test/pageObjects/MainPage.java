package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    @FindBy(xpath = "//a[@productid = '4']" )
    private WebElement addToCartFirstBag;

    @FindBy(xpath = "//a[@productid = '2']" )
    private WebElement addToCartSecondBag;

    @FindBy(xpath = "//a[@productid = '1']" )
    private WebElement addToCartFourthBag;

    @FindBy(xpath = "//a[@productid = '8']" )
    private WebElement addToCartThirdBag;

    @FindBy(xpath = "//span[@class = 'lnr lnr-cart']")
    private WebElement shoppingCartHoverButton;

    @FindBy(xpath = "//i[@class = 'fa fa-angle-right']")
    private WebElement goToCheckoutMainPage;

    @FindBy(xpath = "//section[@class = 'products-grid']")
    private WebElement loagingMainPageElement;

    private CustomWait customWait;

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        customWait = new CustomWait(driver);
        PageFactory.initElements(driver, this);
    }
    public void  addToCartFirstBagMain() {
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartFirstBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartFirstBag);
        addToCartFirstBag.click();
    }
    public void  addToCartSecondBagMain(){
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartSecondBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartSecondBag);
        addToCartSecondBag.click();
    }
    public void  addToCartThirdBagMain(){
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartThirdBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartThirdBag);
        addToCartThirdBag.click();
    }
    public void  addToCartFourthBagMain(){
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartFourthBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartFourthBag);
        addToCartFourthBag.click();
    }
    public void  goToCheckoutMainHower() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartFourthBag);
        customWait.waitForElementToBeClickable(shoppingCartHoverButton);
        customWait.waitForSpinnerToDisappear();
        shoppingCartHoverButton.click();
    }
    public void  goToCheckoutMainClick(){
        customWait.waitForElementToBeClickable(goToCheckoutMainPage);
        goToCheckoutMainPage.click();
    }

}
