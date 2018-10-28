package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.dataGenerator.LoginTestFormData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//a[@text = 'My Account']" )
    private WebElement myAccountDropdown;

    @FindBy(xpath = "//a[@text = 'Sign in']" )
    private WebElement signInDropdown;

    @FindBy(xpath = "//input[@id = 'signin_userName']")
    private WebElement userLoginInput;

    @FindBy(xpath = "//input[@id = 'signin_password']")
    private WebElement userPasswordInput;

    @FindBy(xpath ="//button[@id = 'genericLogin-button']")
    private WebElement hitSignIn;

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginTest(LoginTestFormData loginData) {

        myAccountDropdown.click();
        signInDropdown.click();
        userLoginInput.click();
        userLoginInput.sendKeys(loginData.getEmailAddressLogin());
        userPasswordInput.click();
        userPasswordInput.sendKeys(loginData.getPasswordLogin());
        hitSignIn.click();
    }

}
