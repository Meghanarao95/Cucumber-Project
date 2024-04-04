@Prod
Feature: Login Fearure - Production
         In order to perform a successful Login 
         As a User
         I have to enter the correct username and password

  Scenario: Login to the Facebook Website as a User on Production 
    Given User navigates to the facebook website
    When User validates the homepage title
    Then User enters " valid" Username
    And User enters "valid "  password
    And user validates captcha image
    Then user "should be " successfully logged in

   Scenario: Login to the Facebook Website as a User on Production 
    Given User navigates to the facebook website
    When User validates the homepage title
    Then User enters " invalid" Username
    And User enters "invalid "  password
    And user validates captcha image
    Then user "should be not" successfully logged in
   