package com.test.Nitu.pages;

import com.test.Nitu.util.DriverClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class BasePage {
    WebDriverWait wait;
    WebDriver driver;

    BasePage() {
        driver = DriverClass.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }


    public void waitForPageToLoad(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageToLoad(By identifier) {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(identifier)));
    }

    public void click(WebElement element) {

        element.click();
    }

    public void setValueToElement(WebElement element, String message) {

        element.sendKeys(message);
    }


    public void assertURL() {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl="http://automationpractice.com/index.php?controller=authentication&back=my-account";
        Assert.assertEquals(currentUrl,expectedUrl);
    }
}
