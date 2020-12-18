package com.orangehrm.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _loginPanel;

    //This method will get text from main page Login Panel
    public String getTextFromLoginPanel() {
        Reporter.addStepLog("Get text from Login Panel : " + _loginPanel.toString() + "<br>");
        log.info("Get text from Login Panel : " + _loginPanel.toString());
        return getTextFromElement(_loginPanel);
    }
}
