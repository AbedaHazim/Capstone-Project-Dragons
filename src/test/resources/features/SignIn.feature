@Regression 
Feature: Retail SingnIn

  Background: 
    Given User is on retail website
    When User click on Sign in option
     Then User should be logged in into Account

  @Regression 
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'abeda.hazem123@tekschool.us' and password 'Tek@1234'
    And User click on login button
   

 @Regression 
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                       | password | confirmPassword |
      | Abeda | abeda.hazem123@tekschool.us | Tek@1234 | Tek@1234        |
    And User click on SignUp button
    
