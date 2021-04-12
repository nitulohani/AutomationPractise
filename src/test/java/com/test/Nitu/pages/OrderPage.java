package com.test.Nitu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
    @FindBy (id = "email")
    WebElement email;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="SubmitLogin")
    WebElement login;

    @FindBy(linkText="T-SHIRTS")
    WebElement tshirtBtn;

    @FindBy(className="product-container")
    WebElement prdctContainer;

    @FindBy(className="icon-eye-open")
    WebElement quickView;

    @FindBy(id="add_to_cart")
    WebElement btnCart;

    @FindBy(linkText="Proceed to checkout")
    WebElement btnCheckout;

    @FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElement btnProceed;

    @FindBy(name="processAddress")
    WebElement processAddress;

    @FindBy(id="cgv")
    WebElement consentTerms;
    @FindBy(name="processCarrier")
    WebElement  processCarrier;
    @FindBy(id="total_price_container")
    WebElement  totalPrice;
    @FindBy(id="layer_cart")
    WebElement  modal;
    @FindBy(className ="bankwire")
    WebElement  bankWirePayment;
    @FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
    WebElement  confirmOrder;

    @FindBy(xpath="//*[@id=\"center_column\"]/p/a")
    WebElement  backtoOrders;



    public OrderPage() {

        PageFactory.initElements(driver, this);
    }
    public void setEmail(String loginEmail){
        if(email!=null){
            email.sendKeys(loginEmail);
        }

    }

    public void setPassword(String loginPassword){
        if(password!=null){
          password.sendKeys(loginPassword);
        }

    }
    public void clickSignin(){
        if(login!=null){
            login.click();
        }

    }

    public void orderTshirt() {
        tshirtBtn.click();
        waitForPageToLoad(prdctContainer);
        prdctContainer.click();
        btnCart.click();
        waitForPageToLoad(modal);
        btnCheckout.click();
        btnProceed.click();
        processAddress.click();
        consentTerms.click();
        processCarrier.click();
    }
    public void verifyPayment() {
        bankWirePayment.click();
        confirmOrder.click();

    }

    public void verifyOrderhistory() {
     backtoOrders.click();
    }

    public void waitForPageToLoad() {
        waitForPageToLoad(email);
    }

}
