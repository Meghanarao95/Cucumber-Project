@BVT
Feature: Login Feature
         In order to perform a successful Login 
         As a User
         I have to enter the correct username and password

  Scenario Outline: Login to the Facebook Website as a User
    Given User navigates to the facebook website
    When User validates the homepage title
    Then User enters " <Username> " Username
    And User enters " <password>"  password
    And user selects the age category
    |Age   |
    |below 18|
    |above 18|
    
    And User <LoginType> successfully logged in
    

    Examples: 
      | Username | password | LoginType |
      | valid    | valid    | should    |
      | invalid  | invalid  | should not|
    