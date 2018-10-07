package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.dataGenerator.RegistrationFormData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



}


