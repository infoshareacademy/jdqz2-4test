package com.jdqz2._4test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//button[@class = 'btn-default searchButton']")
    private WebElement searchButton;


}


