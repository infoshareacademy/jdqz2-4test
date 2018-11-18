package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    @FindBy(xpath = "//h3[contains(@text = 'Vintage courier bag' and @productid='9']/following-sibling::h3/a[@class = 'addToCart']")
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

    private CustomWait customWait;

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        customWait = new CustomWait(driver);
        PageFactory.initElements(driver, this);
    }
    public void  addToCartFirstBagMain(){
        customWait.waitForElementToBeVisible(addToCartFirstBag);
        customWait.waitForElementToBeClickable(addToCartFirstBag);
        addToCartFirstBag.click();
    }
    public void  addToCartSecondBagMain(){
        addToCartSecondBag.click();
    }
    public void  addToCartThirdBagMain(){
        addToCartThirdBag.click();
    }
    public void  addToCartFourthBagMain(){
        addToCartFourthBag.click();
    }
    public void  goToCheckoutMainHower() {
        shoppingCartHoverButton.click();
    }
    public void  goToCheckoutMainClick(){
        customWait.waitForElementToBeClickable(goToCheckoutMainPage);
        goToCheckoutMainPage.click();
    }

}

