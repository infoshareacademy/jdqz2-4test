package com.jdqz2._4test.pageObjects;

import com.jdqz2._4test.utils.waits.CustomWait;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;
    private CustomWait customWait;

    @FindBy(xpath = "//a[text() = 'Handbags']")
    private WebElement handbagsButton;

    @FindBy(xpath = "//a[text() = 'Beach bags']")
    private WebElement beachBagsButton;

    @FindBy(xpath = "//a[text() = 'Laptop bags']")
    private WebElement laptopBagsButton;

    @FindBy(xpath = "//a[text() = 'Bags']")
    private WebElement bagsButton;

    @FindBy(xpath = "//h2[text() = 'Handbags']" )
    private WebElement handbagsBanner;

    @FindBy(xpath = "//h2[text() = 'Beach bags']" )
    private WebElement beachBagsBanner;

    @FindBy(xpath = "//h2[text() = 'Bags']" )
    private WebElement bagsBanner;

    @FindBy(xpath = "//h2[text() = 'Laptop bags']" )
    private WebElement laptopBagsBanner;

    public MainPage(WebDriver driver) {

        customWait = new CustomWait(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void buttonsTest(){

        customWait.waitForElementToBeClickable(handbagsButton);
        handbagsButton.click();
        Assert.assertEquals(handbagsBanner.isDisplayed(), true);
        beachBagsButton.click();
        Assert.assertEquals(beachBagsBanner.isDisplayed(), true);
        bagsButton.click();
        Assert.assertEquals(bagsBanner.isDisplayed(), true);
        laptopBagsButton.click();
        Assert.assertEquals(laptopBagsBanner.isDisplayed(), true);

    }





}


