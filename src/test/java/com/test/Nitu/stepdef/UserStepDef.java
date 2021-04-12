package com.test.Nitu.stepdef;

import com.test.Nitu.pages.OrderPage;
import com.test.Nitu.pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserStepDef {
    private final UserPage userpage=new UserPage();
    @And ( "Click Your Personal Information" )
    public void clickYourPersonalInformation() {
        userpage.openPersonalInfo();
    }

    @Then ( "Update First Name" )
    public void updateFirstName() {
    }
}
