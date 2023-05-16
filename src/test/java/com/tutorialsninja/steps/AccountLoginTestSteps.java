package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AccountLoginTestSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I click on 'MyAccountTab' link$")
    public void iClickOnMyAccountTabLink() {
        new MyAccountPage().clickOnMyQAccountTab();
    }

    @When("^I select \"([^\"]*)\" option from my accounts dropdown list$")
    public void iSelectOptionFromMyAccountsDropdownList(String option)  {
        new MyAccountPage().selectMyAccountOptions(option);
    }

    @Then("^I verify \"([^\"]*)\" text on account login page$")
    public void iVerifyTextOnAccountLoginPage(String expectedText)  {
        String actualText = new AccountLoginPage().getReturningCustomerText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("^I enter email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String email)  {
       new AccountLoginPage().enterEmailAddress(email);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password)  {
        new AccountLoginPage().enterPassword(password);

    }

    @And("^I click on 'Login' button$")
    public void iClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }



    @And("^I select option from My account options as \"([^\"]*)\"$")
    public void iSelectOptionFromMyAccountOptionsAs(String option)  {
        new MyAccountPage().selectMyAccountOptions(option);
    }

    @Then("^I verify \"([^\"]*)\" text on account page$")
    public void iVerifyTextOnAccountPage(String expectedText)  {
       String actualText = new MyAccountPage().getAccountLogoutText();
       Assert.assertEquals(actualText,expectedText);
    }

    @And("^I click on 'Continue' button$")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnContinueButton();
    }


}
