$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user I want to use login and log out functionality of OrangeHrm website",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10530898500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should log out successfully and after that should see Login Panel",
  "description": "",
  "id": "login;user-should-log-out-successfully-and-after-that-should-see-login-panel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Welcome Text",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Logout button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "On main page I should see text \"LOGIN Panel\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 452849100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterUsername(String)"
});
formatter.result({
  "duration": 361249900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "LoginStepdefs.iEnterPassword(String)"
});
formatter.result({
  "duration": 260400500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 1767314400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnWelcomeText()"
});
formatter.result({
  "duration": 934580900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefs.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 30255945100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Logout\u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-5RQNPPNH\u0027, ip: \u0027192.168.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\arpan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53562}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 8621281c07dcc323ad99254dfa2b0571\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Logout\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.orangehrm.demo.utility.Utility.clickOnElement(Utility.java:41)\r\n\tat com.orangehrm.demo.pages.MarketplacePage.clickOnLogoutButton(MarketplacePage.java:38)\r\n\tat com.orangehrm.demo.cucumber.stepdefs.LoginStepdefs.iClickOnLogoutButton(LoginStepdefs.java:46)\r\n\tat ✽.And I click on Logout button(src/test/java/resources/featurefile/login.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOGIN Panel",
      "offset": 32
    }
  ],
  "location": "LoginStepdefs.onMainPageIShouldSeeText(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1746496300,
  "status": "passed"
});
});