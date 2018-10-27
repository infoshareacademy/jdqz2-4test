package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

}
