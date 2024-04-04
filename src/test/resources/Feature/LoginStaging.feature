@Staging
Feature: Login Fearure -Staging
         In order to perform a successful Login 
         As a User
         I have to enter the correct username and password

  Background: 
    Given User navigates to the facebook website
    When User validates the homepage title

  Scenario: Login to the Facebook Website as a Valid User on Staging
    Then User enters " Valid " Username
    And User enters " Valid "  password
    And User clicks on signin button

  Scenario: Login to the Facebook Website as a Invalid User on Staging
    Then User enters " Invalid " Username
    And User enters " Invalid"  password
    And User clicks on signin button
