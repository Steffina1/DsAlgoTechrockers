  @test
Feature: Title of your feature
  I want to use this template for my feature file

  @test
  Scenario Outline: Login to the application with valid credentials.
    Given The user is in sign in page
    When  The user gets the data from the datasheet with "<testId>" and "<sheetName>"
    And   The user clicks on Login button
    Then  The user is logged in to the homepage   
     
   Examples:
   |testId|sheetName|
   |    a |Sheet1   |
  
   