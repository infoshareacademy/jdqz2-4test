package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id = 'signin_userName']")
    private WebElement userLoginInput;

    @FindBy(xpath = "//input[@id = 'signin_password']")
    private WebElement userPasswordInput;

}
