package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "//a[@onclick = 'viewShoppingCartPage();']")
    private WebElement checkoutButtonFromShoppingCartHoverButton;

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
    public void  goToCheckout(){

        checkoutButtonFromShoppingCartHoverButton.click();
    }
}
