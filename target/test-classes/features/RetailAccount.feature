@Regression
Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'abeda.hazem123@tekschool.us' and password 'Tek@1234'
    And User click on login button
    And User should be logged in into Account

  @Account @Regression
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Abeda' and Phone '918-123-9900'
    And User click on Update button
    Then user profile information should be updated

  @AccountUdate @Regression
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1111222233335643 | Abeda      |               9 |           2027 |          456 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @EditPaymentAccount @Regression
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4444333388884480     |Hazim      | 10           | 2028         |345        |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @remove @Regression
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress @Regression
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress    | apt | city       | state      | zipCode |
      | United States | Abeda    | 444-333-2222 | 2666 Cattage Way |  78 | Sacramento | California |   95679 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully’
@updateAddress @Regression
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user eidt new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United States   | Abeda   | 555-222-5654       | 10891 Coloma Road | 62 | Sacramento|   California | 95670   |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully’
@removeAdress @Regression
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
