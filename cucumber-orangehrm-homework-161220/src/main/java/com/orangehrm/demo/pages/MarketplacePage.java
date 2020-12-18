package com.orangehrm.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketplacePage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement _welcomeText;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement _logOut;

    //This method will get text from Welcome Admin after log in successfully
    public String getWelcomeTextAfterLogin() {
        Reporter.addStepLog("Get Welcome Text After Login : " + _welcomeText.toString() + "<br>");
        log.info("Get Welcome Text After Login : " + _welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }

    //This method will click on Welcome Text
    public void clickOnWelcomeText() {
        Reporter.addStepLog("Click On Welcome Text : " + _welcomeText.toString() + "<br>");
        log.info("Click on Welcome Text : " + _welcomeText.toString());
        clickOnElement(_welcomeText);
    }

    //This method will click on Logout button
    public void clickOnLogoutButton() {
        Reporter.addStepLog("Click On Log out button : " + _logOut.toString() + "<br>");
        log.info("Click on Welcome Text : " + _logOut.toString());
        clickOnElement(_logOut);
    }
}
