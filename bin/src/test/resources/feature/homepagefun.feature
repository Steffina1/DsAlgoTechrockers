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
@homepge
Feature: Home page functionality

  @beforelogin
  Scenario: Test if the user is able to navigate to the homepage from portal page
    Given The user is in the portal page 
    When The user clicks on the get started button
    Then The user should land on the homepage and see 7 panes of different data structures 

    
    @beforelogin
    Scenario: Test if the user is able to click on dropdown before signing in 
    Given The user is in the homepage
    When The user clicks on Data Structures dropdown
    Then The user should see 6 different data structure entries in dropdown
    
    @beforelogin
    Scenario: Test if the user is able to navigate to data structure pages from dropdown before signing in 
    Given The user is in the homepage
    When The user selects each data structure item from the dropdown 
    And  The user clicks on get started button of each data structure
    Then An alert message "You are not logged in" should be displayed
   
   
    
    @afterlogin
    Scenario Outline: Test if the user is able to navigate to data structure pages from clicking dropdown after signing in 
    Given The user is in the homepage
    When The user clicks on sign in button
    And The user enters the valid credentials from data sheet under "<testid>" and "<sheetname>" and clicks on sign in
    Then The user should land on the homepage and see 7 panes of different data structures 
    When The user selects each data structure item from the dropdown
    Then The user should be directed to the respective data structure page
   
     Examples:
    |testid|sheetname|
    |    2  |  Login |
    
    
    @afterlogin
    Scenario Outline: Test if the user is able to navigate to data structure pages from clicking getstarted button after signing in 
    Given The user is in the homepage
    When The user clicks on sign in button
    And The user enters the valid credentials from data sheet under "<testid>" and "<sheetname>" and clicks on sign in
    Then The user should land on the homepage and see 7 panes of different data structures 
     When The user clicks on get started button of each data structure and navigates back
     Then The user should be directed to the respective data structure page
      Examples:
    |testid|sheetname|
    |    2  |  Login |
    