package com.orangehrm.demo.cucumber.stepdefs;

import com.orangehrm.demo.pages.LoginPage;
import com.orangehrm.demo.pages.MainPage;
import com.orangehrm.demo.pages.MarketplacePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see welcomeText \"([^\"]*)\"$")
    public void iShouldSeeWelcomeText(String welcomeText) {
        Assert.assertEquals(welcomeText, new MarketplacePage().getWelcomeTextAfterLogin());
    }

    @And("^I click on Welcome Text$")
    public void iClickOnWelcomeText() {
        new MarketplacePage().clickOnWelcomeText();
    }

    @And("^I click on Logout button$")
    public void iClickOnLogoutButton() {
        new MarketplacePage().clickOnLogoutButton();
    }

    @Then("^On main page I should see text \"([^\"]*)\"$")
    public void onMainPageIShouldSeeText(String text) {
        Assert.assertEquals(text, new MainPage().getTextFromLoginPanel());

    }


}
