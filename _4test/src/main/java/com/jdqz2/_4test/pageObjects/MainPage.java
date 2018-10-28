package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//a[@class = 'addToCart' and @productid = '4']" )
    private WebElement addToCartFirstBag;

    @FindBy(xpath = "//a[@class = 'addToCart' and @productid = '2']" )
    private WebElement addToCartSecondBag;

    @FindBy(xpath = "//a[@class = 'addToCart' and @productid = '1']" )
    private WebElement addToCartFourthBag;

    @FindBy(xpath = "//a[@class = 'addToCart' and @productid = '8']" )
    private WebElement addToCartThirdBag;

    @FindBy(xpath = "//span[@class = 'lnr lnr-cart']")
    private WebElement shoppingCartHoverButton;

    @FindBy(xpath = "//i[@class = 'fa fa-angle-right']")
    private WebElement goToCheckoutMainPage;

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void  addToCartFirstBagMain(){
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
        goToCheckoutMainPage.click();
    }
}

