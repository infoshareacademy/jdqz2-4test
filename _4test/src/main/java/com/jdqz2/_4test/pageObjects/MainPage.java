package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private final WebDriver driver;

    @FindBy(xpath = "//button[@class = 'btn-default searchButton']")
    private WebElement searchButton;
    @FindBy(xpath = "//input[@id = 'searchField']")
    private WebElement searchField;

    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void search(String text){
        searchField.sendKeys(text);
        searchButton.click();
    }
}


