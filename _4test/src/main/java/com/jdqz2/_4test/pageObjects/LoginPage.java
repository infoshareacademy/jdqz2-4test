package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.dataGenerator.LoginTestFormData;
import com.jdqz2._4test.utils.waits.CustomWait;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;
    private CustomWait customWait;

    @FindBy(xpath = "//a[text() = 'My Account']")
    private WebElement myAccountDropdown;

    @FindBy(xpath = "//a[text() = 'Sign in']")
    private WebElement signInDropdown;

    @FindBy(xpath = "//input[@id = 'signin_userName']")
    private WebElement userLoginInput;

    @FindBy(xpath = "//input[@id = 'signin_password']")
    private WebElement userPasswordInput;

    @FindBy(xpath = "//button[@id = 'genericLogin-button']")
    private WebElement hitSignIn;

    @FindBy(xpath = "//a[text() = 'Register']")
    private WebElement hitRegister;

    //Selectors used registerUserAgain method

    @FindBy(xpath = "//input[@id = 'firstName']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id = 'lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//select[@id = 'registration_country']")
    private WebElement countryList;

    @FindBy(xpath = "//input[@id = 'hidden_zones']")
    private WebElement stateInputField;

    @FindBy(xpath = "//input[@id = 'emailAddress']")
    private WebElement mailInputField;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id = 'passwordAgain']")
    private WebElement repeatPasswordField;

    @FindBy(xpath = "//button[text() = 'Create an account']")
    private WebElement hitCreate;

    @FindBy(xpath = "//div[@id = 'main-content']")
    private WebElement loginSuccessMenu;


    public LoginPage(WebDriver driver) {

        customWait = new CustomWait(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginTest(LoginTestFormData loginData) {

        customWait.waitForElementToBeClickable(myAccountDropdown);
        myAccountDropdown.click();
        customWait.waitForElementToBeVisible(signInDropdown);
        signInDropdown.click();
        userLoginInput.click();
        userLoginInput.sendKeys(loginData.getEmailAddressLogin());
        userPasswordInput.click();
        userPasswordInput.sendKeys(loginData.getPasswordLogin());
        hitSignIn.click();

        customWait.waitForElementToBeVisible(loginSuccessMenu);

    }

    public void assertLoginWasSuccessful() {
        Assert.assertEquals(loginSuccessMenu.isDisplayed(), true);
    }

}
