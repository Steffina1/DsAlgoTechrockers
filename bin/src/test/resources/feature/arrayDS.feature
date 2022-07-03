@test
Feature: Array data structure

@test
   Scenario Outline: Login to the application with valid credentials.
    Given The user is in the home page 
    When The user gets the valid data from the datasheet with "<testId>" and "<sheetName>"
    And The user clicks array button in the home page
    Then The user should be directed to array Page
    
     Examples:
   |testId|sheetName|
   |    a |Sheet1   |
    
     @test1
   Scenario: 
   Given The user is in the Array page after logged in
   When  The user clicks Arrays in Python page
   And   The user clicks Try Here button in Arrays in python page 
   When  The User enters pyton code and run it in python page
   Then  The user should get print statement for python page
        
   @test1
   Scenario: 
   Given The user is in the Array page after logged in
   When  The user clicks arrays using List button
   And   The user clicks Try Here button in arrays using List page
   When  The User enters pyton code and run it in Arrays using List 
   Then  The user should get print statement for Arrays using List 
   
   @test1
   Scenario: 
   Given The user is in the Array page after logged in
   When  The user clicks Basic operations in List button
   And   The user clicks Try Here button in Basic Operations in List button page
   When  The User enters pyton code and run it in Basic Operations in List button
   Then  The user should get print statement for Basic Operations in List button
   
  
   
   @test1
   Scenario: 
   Given The user is in the Array page after logged in
   When  The user clicks Applications of Arrays
   And   The user clicks Try Here button in Applications of arrays page
   When  The User enters pyton code and run it in Applications of Arrays
   Then  The user should get print statement for Applications of Arrays
        
