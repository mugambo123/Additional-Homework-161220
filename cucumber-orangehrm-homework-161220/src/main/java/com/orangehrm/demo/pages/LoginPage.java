package com.orangehrm.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement _enterUserName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement _password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement _loginButton;

//This method enter username
    public void enterUserName (String username){
        Reporter.addStepLog("Enter User Name : " +_enterUserName.toString() + "<br>" );
        log.info("Enter User Name : " +_enterUserName.toString() );
        sendTextToElement(_enterUserName, username);
    }
    //This method enter password
    public void enterPassword (String password){
        Reporter.addStepLog("Enter Password : " +_password.toString() + "<br>" );
        log.info("Enter Password : " +_password.toString() );
        sendTextToElement(_password, password);
    }

    //This method click on Login Button
    public void clickOnLoginButton(){
        Reporter.addStepLog("Click on Login Button : "+ _loginButton.toString() + "<br>");
        log.info("Click on Login Button : "+ _loginButton.toString());
        clickOnElement(_loginButton);
    }

}
