package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DesktopsPageTestSteps {

    @When("^I select currency as \"([^\"]*)\"$")
    public void iSelectCurrencyAs(String currency)  {
       new HomePage().selectCurrency(currency);
    }

    @And("^I mouse hover on 'Desktops' link and click$")
    public void iMouseHoverOnDesktopsLinkAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }


    @And("^I select sort by option as \"([^\"]*)\" on desktops page$")
    public void iSelectSortByOptionAsOnDesktopsPage(String option)  {
        new DesktopPage().selectSortByOption(option);
    }

    @Then("^I verify elements are sorted in reverse order$")
    public void iVerifyElementsAreSortedInReverseOrder() {
        new DesktopPage().verifySortedElementsInReverseOrder();
    }

    @And("^I select menu as \"([^\"]*)\" from top menu$")
    public void iSelectMenuAsFromTopMenu(String menu)  {
        new HomePage().selectMenu(menu);
    }

    @And("^I select product by name as \"([^\"]*)\"$")
    public void iSelectProductByNameAs(String productName)  {
        new DesktopPage().selectProductByName(productName);
    }

    @Then("^I verify product text as \"([^\"]*)\"$")
    public void iVerifyProductTextAs(String expectedProductName)  {
        String actualProductName = new ProductPage().getProductText();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @When("^I select delivery date as \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iSelectDeliveryDateAs(String date, String month, String year)  {
        new ProductPage().selectDeliveryDate(date,month,year);
    }

    @And("^I enter quantity as \"([^\"]*)\"$")
    public void iEnterQuantityAs(String qty)  {
        new ProductPage().enterQuantity(qty);
    }

    @And("^I click on 'Add to cart' button to shopping cart$")
    public void iClickOnAddToCartButtonToShoppingCart() {
        new ProductPage().clickOnAddToCartButton();
    }


    @Then("^I verify product success message for desktop$")
    public void iVerifyProductSuccessMessageAs() {
        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
       String actualMessage =new ProductPage().getProductAddedSuccessMessage();
       Assert.assertEquals(actualMessage,expectedMessage);
    }



    @When("^I click on 'Shopping cart' link into message$")
    public void iClickOnShoppingCartLinkIntoMessage() throws InterruptedException {
        Thread.sleep(1000);
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @Then("^I verify \"([^\"]*)\" text on cart page$")
    public void iVerifyTextOnCartPage(String expectedText)  {
        String actualText = new ShoppingCartPage().getShoppingCartText();
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @And("^I verify product name as \"([^\"]*)\"$")
    public void iVerifyProductNameAs(String expectedProductName)  {
        String actualProductName = new ShoppingCartPage().getProductName();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @And("^I verify delivery date as \"([^\"]*)\"$")
    public void iVerifyDeliveryDateAs(String expectedDeliveryDate)  {
        String actualDeliveryDate = new ShoppingCartPage().getDeliveryDate();
        Assert.assertTrue(actualDeliveryDate.contains(expectedDeliveryDate));
    }

    @And("^I verify model as \"([^\"]*)\"$")
    public void iVerifyModelAs(String expectedModel)  {
        String actualModel = new ShoppingCartPage().getModel();
        Assert.assertEquals(actualModel,expectedModel);
    }

    @And("^I verify price as \"([^\"]*)\"$")
    public void iVerifyPriceAs(String expectedPrice)  {
       String actualPrice =  new ShoppingCartPage().getTotal();
       Assert.assertEquals(actualPrice,expectedPrice);
    }


}
