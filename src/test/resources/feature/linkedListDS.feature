@tagLL
Feature: Linked List 

@testLL001
   Scenario Outline: Login to the application with valid credentials. 
    Given The user is in the home Page after logged in
    When  When The user gets the validData from the datasheet with "<testId>" and "<sheetName>"
    And The user clicks Linked List  button in the home page 
    Then The user should be directed to Linked List  Page with "Linked List"
    
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
     @testLL002
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks introduction button
   And   The user clicks Try Here button in Introductio page
   When  The User enters pyton code and run it in Introduction
   Then  The user should get print statement for Introduction
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL003
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Creating Linked LIst button
   And   The user clicks Try Here button in Creating Linked LIst page
   When  The User enters pyton code and run it in Creating Linked LIst
   Then  The user should get print statement for Creating Linked LIst
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL004
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Types of Linked List button
   And   The user clicks Try Here button in Types of Linked Listpage
   When  The User enters pyton code and run it in Types of Linked List
   Then  The user should get print statement for Types of Linked List
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL005
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Implement Linked List in Python button
   And   The user clicks Try Here button in Implement Linked List in Python page
   When  The User enters pyton code and run it in Implement Linked List
   Then  The user should get print statement for Implement Linked List
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL006
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Traversal button
   And   The user clicks Try Here button in Traversal page
   When  The User enters pyton code and run it in Traversal
   Then  The user should get print statement for Traversal
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL007
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Insertion button
   And   The user clicks Try Here button in Insertion page
   When  The User enters pyton code and run it in Insertion
   Then  The user should get print statement for Insertion
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
   
   @testLL008
   Scenario Outline:
   Given The user is in the Linked List  page after logged in with input from data sheet under "<testId>" and "<sheetName>"
   When  The user clicks Deletion button
   And   The user clicks Try Here button in Deletion page
   When  The User enters pyton code and run it in Deletion
   Then  The user should get print statement for Deletion
   
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |