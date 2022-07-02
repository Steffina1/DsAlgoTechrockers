#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@datastructure
Feature: Data Structure Introduction page functionality
  

  @ds
  Scenario Outline: Test if the user is able to navigate to the Data Structure Introduction page
    Given The user is in the hompage
    When The user clicks on submit after entering valid credentials from the data sheet with "<testid>" and "<sheetname>" 
    And The user clicks on Get Started under Data Structure Introduction 
    Then The user should be navigated to the "Data Structure Introduction page"
   
    Examples:
    |testid|sheetname|
    |   2  | Login   |

  
    
   @ds
  Scenario Outline: Test if the user is able to navigate to the Time Complexity page
    Given The user is signed in to the homepage with input from data sheet under "<testid>" and "<sheetname>"
    And The user is in Data Structure Introduction page
    When The user clicks on Time Complexity
    Then The user should be navigated to the "Time Complexity" page
    
   Examples:
    |testid|sheetname|
    |   2  | Login   |
    
    @ds 
    Scenario Outline: Test if the try editor is working in the Time Complexity page
    Given The user is signed in to the homepage with input from data sheet under "<testid>" and "<sheetname>"
    And The user is in Time Complexity page 
    When The user clicks on Try Here in the Time Complexity page 
    And The user enters the input and clicks Run
    Then The ouput should be printed
    Examples:
    |testid|sheetname|
    |   2  | Login   |
    
    @ds
  Scenario Outline: Test the navigation of Practice Questions in data structure introduction page 
    Given  The user is in the Data Structure Introduction page by signing with data from sheet under "<testid>" and "<sheetname>"
     When The user clicks on Time Complexity
     And  The user clicks on Practice Questions
     Then The user should be navigated to the Practice Questions page
      Examples:
    |testid|sheetname|
    |   2  | Login   |
    