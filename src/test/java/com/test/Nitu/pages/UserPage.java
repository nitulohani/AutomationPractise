package com.test.Nitu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
    WebElement myPersonalInfo;
    @FindBy (id ="submitIdentity")
    WebElement saveBtn;
    @FindBy (id ="firstname")
    WebElement firstName;
    @FindBy (id ="old_passwd")
    WebElement oldPassword;
    @FindBy (id ="passwd")
    WebElement newPassword;
    @FindBy (id ="confirmation")
    WebElement confrPassword;



    public UserPage() {

        PageFactory.initElements(driver, this);
    }


    public void openPersonalInfo() {
        myPersonalInfo.click();
        firstName.clear();
        firstName.sendKeys("New Name");
        oldPassword.sendKeys("Test@1234");
        newPassword.sendKeys("Test@12345");
        confrPassword.sendKeys("Test@12345");
        saveBtn.click();

    }
}
