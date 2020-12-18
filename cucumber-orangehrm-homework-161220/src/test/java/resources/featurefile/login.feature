Feature: Login
  As a user I want to use login and log out functionality of OrangeHrm website

  @Smoke
  Scenario: User should login and can see welcome text
    Given I am on home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on Login button
    Then I should see welcomeText "Welcome Admin"

  @Regression
  Scenario: User should log out successfully and after that should see Login Panel
    Given I am on home page
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on Login button
    And I click on Welcome Text
    And I click on Logout button
    Then On main page I should see text "LOGIN Panel"



