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
Feature: SIGNUP

@regression
  Scenario: Verify User is able to Register 
    Given user Launch Chrome Browser 
    When User opens url "https://demo.nopcommerce.com/"
    When User click on register 
    And User is select Gender Option
    And User is fill First Name	
    And User is fill Second Name
    And user is DOB 
    And user is fill email
    And user is fill Company name
    And user is fill Pswrd
    And user is fill ConfPswrd
    When user is click on Register button
    Then User is sucessfully register
    When user is click on logout link
    And  Close the Browser
    
    