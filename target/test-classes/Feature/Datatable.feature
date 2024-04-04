@Datatable
Feature: Login Fearure
         In order to perform a successful Login 
         As a User
         I have to enter the correct username and password

  Scenario: Login to the Facebook Website as a User
    Given User navigates to the facebook website
    When User validates the homepage title
    Then User enters "Valid " Username
    And User enters "Valid"  password
    And User enters firstname and last name
      | Firstname | Lastname |
      | Megh      | Rao      |
      | Ketty     | Perry    |
    And User clicks on signin button
