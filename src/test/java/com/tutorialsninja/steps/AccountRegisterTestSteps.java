package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AccountRegisterTestSteps {

    @Then("^I verify \"([^\"]*)\" text on account register page$")
    public void iVerifyTextOnAccountRegisterPage(String expectedText)  {
       String actualText = new AccountRegisterPage().getRegisterAccountText();
        Assert.assertEquals(actualText,expectedText);
    }

    @And("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstName)  {
       new AccountRegisterPage().enterFirstName(firstName);
    }

    @And("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String lastName)  {
        new AccountRegisterPage().enterLastName(lastName);

    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email)  {
        new AccountRegisterPage().enterEmail(email);

    }

    @And("^I enter telephone as \"([^\"]*)\"$")
    public void iEnterTelephoneAs(String telephone)  {
        new AccountRegisterPage().enterTelephone(telephone);

    }

    @And("^I enter password as \"([^\"]*)\" on account register page$")
    public void iEnterPasswordAsOnAccountRegisterPage(String password)  {
       new AccountRegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String cPassword)  {
        new AccountRegisterPage().enterConfirmPassword(cPassword);

    }

    @And("^I select subscription as \"([^\"]*)\"$")
    public void iSelectSubscriptionAs(String option)  {
        new AccountRegisterPage().selectSubscription(option);

    }

    @And("^I click on 'Privacy Policy' checkbox$")
    public void iClickOnPrivacyPolicyCheckbox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();

    }

    @And("^I click on 'Continue' button on account register page$")
    public void iClickOnContinueButtonOnAccountRegisterPage() {
        new AccountRegisterPage().clickOnContinueButton();

    }

    @Then("^I verify account created text \"([^\"]*)\"  on account page$")
    public void iVerifyAccountCreatedTextOnAccountPage(String expectedText)  {
        String actualText = new MyAccountPage().getYourAccountHasBeenCreatedText();
        Assert.assertEquals(actualText,expectedText);
    }


}
