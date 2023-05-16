package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {

    @Then("^I verify the title as \"([^\"]*)\" on desktops page$")
    public void iVerifyTheTitleAsOnDesktopsPage(String expectedTitle)  {
      String actualTitle =new DesktopPage().getDesktopsText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("^I verify the title as \"([^\"]*)\" on laptops and notebooks page$")
    public void iVerifyTheTitleAsOnLaptopsAndNotebooksPage(String expectedTitle)  {
        String actualTitle =new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("^I verify the title as \"([^\"]*)\" on components page$")
    public void iVerifyTheTitleAsOnComponentsPage(String expectedTitle)  {
        String actualTitle =new ComponentsPage().getComponentsText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("^I mouse hover on 'Components' link and click$")
    public void iMouseHoverOnComponentsLinkAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }
}
