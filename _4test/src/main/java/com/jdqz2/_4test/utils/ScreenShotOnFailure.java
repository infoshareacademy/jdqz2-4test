package com.jdqz2._4test.utils;


import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ScreenShotOnFailure extends TestWatcher {

    private WebDriver driver;

    public ScreenShotOnFailure(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        try {
            captureScreenShot(description.getMethodName());
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
    }

    public void captureScreenShot(String fileName) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        fileName += UUID.randomUUID().toString();
        File targetFile = new File("Screenshot/" + fileName + ".png");
    }
}
