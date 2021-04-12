package com.test.Nitu.stepdef;

import com.test.Nitu.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepdef {
    private final OrderPage orderpage=new OrderPage();
    @Given ( "^User is on Home page$" )
    public void userIsOnHomePage() {
        orderpage.waitForPageToLoad();
        orderpage.assertURL();
    }

    @When ( "Enter username as {string} and password as {string}" )
    public void enterUsernameAsAndPasswordAs(String arg0, String arg1) {
        orderpage.setEmail(arg0);
        orderpage.setPassword(arg1);
        orderpage.clickSignin();
    }

    @Then ( "Order tshirt" )
    public void orderTshirt() {
        orderpage.orderTshirt();
    }


    @Then ( "Make payment" )
    public void makePayment() {
        orderpage.verifyPayment();
    }

    @Then ( "Verify in Order History" )
    public void verifyInOrderHistory() {
        orderpage.verifyOrderhistory();
    }


}
