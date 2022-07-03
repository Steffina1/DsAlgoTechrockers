 @tagS
Feature: Stack

   @testS001
     Scenario Outline: Login to the application with valid credentials.
    Given The user is in the Home page after logged in
    When  The user gets the validdata from the datasheet with "<testId>" and "<sheetName>"
    And The user clicks stack button in the home page 
    Then The user should be directed to Stack Page with "Stack"
    
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
      
  @testS002
   Scenario Outline:
   Given The user is in the Stack page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks operations in Stack button
   And   The user clicks Try Here button in Operations in Stack page
   When  The User enters pyton code and run it in Operations in Stack
   Then  The user should get print statement for Operations in Stack
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @testS003
    Scenario Outline:
   Given The user is in the Stack page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks implementation button
   And   The user clicks Try Here button in Implementation page
   When  The User enters pyton code and run it in Implementation
   Then  The user should get print statement for Implementation
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
  @testS004
   Scenario Outline:
   Given The user is in the Stack page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Types of Applications
   And   The user clicks Try Here button inApplications page
   When  The User enters pyton code and run it in Applications
   Then  The user should get print statement for Applications
    Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
