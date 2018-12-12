package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.dataGenerator.RegistrationFormData;
import com.jdqz2._4test.utils.waits.CustomWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

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

    private WebDriver driver;
    private CustomWait wait;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new CustomWait(driver);
        PageFactory.initElements(driver,this);
    }

    public void registerToPage(RegistrationFormData registrationFormData){
        nameField.click();
        nameField.sendKeys(registrationFormData.getFirstName());
        lastNameField.click();
        lastNameField.sendKeys(registrationFormData.getLastName());
        countryList.click();
        countryList.sendKeys(registrationFormData.getCountry());
        countryList.click();
        stateInputField.click();
        stateInputField.sendKeys(registrationFormData.getStateProvince());
        mailInputField.click();
        mailInputField.sendKeys(registrationFormData.getEmailAddress());
        passwordField.click();
        passwordField.sendKeys(registrationFormData.getPassword());
        wait.waitForElementToBeClickable(repeatPasswordField);
        repeatPasswordField.sendKeys(registrationFormData.getPassword());
        hitCreate.click();
    }


}


