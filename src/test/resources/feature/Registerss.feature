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
@register
Feature: Register functionality
 @reg
 Scenario: Test if the user is able to navigate to the register page from homepage
 Given The user is in the home page
 When The user clicks on the Register button
 Then The user should be navigated to the Register page
 
 @reg
  Scenario Outline: Test if the user is able to register with invalid credentials
    Given The user is in the register page
    When The user enters invalid data from datasheet with "<testid>" and "<sheetname>"
    And The user clicks on submit button
   Then An error message "password mismatch" should be displayed in the register page
    Examples:
    |testid|sheetname|
    #|    1 |Register |
    #|    2 |Register |
    |    3 |Register |
    |   4  |Register |
    

  @reg
  Scenario Outline: Test if the user is able to register with valid credentials
    Given The user is in the register page
    When The user enters valid data from datasheet with "<testid>" and "<sheetname>"
    And The user clicks on submit button
    Then The user should successfully login to the homepage with a message "You are logged in"
    Examples:
    |testid|sheetname|
    |    5 |Register |

  