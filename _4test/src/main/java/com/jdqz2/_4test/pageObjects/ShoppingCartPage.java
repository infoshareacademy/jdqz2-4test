package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    @FindBy(xpath = "//input[@id = '52']")
    private WebElement quantityDropdownMenu;

    @FindBy(xpath = "//a[@class = 'cart-close removeProductIcon']")
    private WebElement removeItemCartPage;

    @FindBy(xpath = "//a[text() = 'Recalculate']")
    private WebElement recalculateButton;

    @FindBy(xpath = "//a[text() = 'Continue shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//a[text() = 'Proceed to checkout']")
    private WebElement proceedButton;

    @FindBy(xpath = "//span[contains(text(), 'Chic vintage DeVille')]")
    private WebElement chicDevilleBagInCart;

    private CustomWait customWait;

    private WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        customWait = new CustomWait(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean proceedButtonIsDisplayed(){
        customWait.waitForElementToBeVisible(proceedButton);
        proceedButton.isDisplayed();
        return proceedButton.isDisplayed();
    }

    public void continueShopping(){
        //customWait.waitForSpinnerToDisappear();
        customWait.waitForElementToBeVisible(continueShoppingButton);
        customWait.waitForElementToBeClickable(continueShoppingButton);
        continueShoppingButton.click();
    }
    public boolean checkIfChicDevilleBagIsInCart() {
        customWait.waitForElementToBeVisible(chicDevilleBagInCart);
        return chicDevilleBagInCart.isDisplayed();
    }

}
