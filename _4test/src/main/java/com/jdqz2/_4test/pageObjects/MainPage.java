package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath = "//a[contains(@href, 'shop/product/chic-vintage-deville.html')]")
    private WebElement firstBagImage;

    @FindBy(xpath = "//h2[contains(text(), 'Featured items')]")
    private WebElement featuredItemsText;

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
        Assert.assertEquals(addToCartFirstBag.isDisplayed(), true);
    }
    public void  addToCartSecondBagMain() throws InterruptedException {
        customWait.waitForSpinnerToDisappear();
        Thread.sleep(1000);
        customWait.waitForElementToBeClickable(addToCartSecondBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartSecondBag);
        customWait.waitForElementToBeVisible(addToCartSecondBag);
        customWait.waitForElementToBeClickable(addToCartSecondBag);
        addToCartSecondBag.click();
        Assert.assertEquals(addToCartSecondBag.isDisplayed(), true);
    }
    public void  addToCartThirdBagMain(){
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartThirdBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartThirdBag);
        addToCartThirdBag.click();
        Assert.assertEquals(addToCartThirdBag.isDisplayed(), true);
    }
    public void  addToCartFourthBagMain(){
        customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeClickable(addToCartFourthBag);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartFourthBag);
        addToCartFourthBag.click();
        Assert.assertEquals(addToCartFourthBag.isDisplayed(), true);
    }
    public void goToCheckoutMainHoverClick() throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addToCartFourthBag);
        customWait.waitForElementToBeClickable(shoppingCartHoverButton);
        customWait.waitForSpinnerToDisappear();
        Actions builder = new Actions(driver);
        builder.moveToElement(shoppingCartHoverButton).moveToElement(shoppingCartHoverButton).build().perform();
                customWait.waitForElementToBeClickable(goToCheckoutMainPage);
        Thread.sleep(800);
        goToCheckoutMainPage.click();
    }

    public void  goToFirstBagPage(){
        customWait.waitForSpinnerToDisappear();
        Assert.assertEquals(firstBagImage.isDisplayed(), true);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", firstBagImage);
        customWait.waitForElementToBeClickable(firstBagImage);
        firstBagImage.click();
    }
    public boolean featuredItemsTextIsDisplayed() {
        customWait.waitForElementToBeVisible(featuredItemsText);
        featuredItemsText.isDisplayed();
        return featuredItemsText.isDisplayed();
    }

}
