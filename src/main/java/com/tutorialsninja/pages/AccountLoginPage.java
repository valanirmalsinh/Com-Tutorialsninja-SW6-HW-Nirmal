package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());
    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;



    public String getReturningCustomerText() {
        log.info("Getting returning customer text : " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);


    }

    public String getNewCustomerText() {
        log.info("Getting new customer text : " + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }


    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddressField, email);
        log.info("Entering email address : " + emailAddressField.toString());


    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + passwordField.toString());


    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
        log.info("Clicking on login button : " + loginBtn.toString());

    }

}
