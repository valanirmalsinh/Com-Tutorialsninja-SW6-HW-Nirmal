Feature: Account Login Page
  As a user I want to check Account login page functionality

@sanity @regression
 Scenario: Verify user should navigate to login page successfully
   Given   I am on homepage
  When     I click on 'MyAccountTab' link
   When    I select "Login" option from my accounts dropdown list
   Then    I verify "Returning Customer" text on account login page

  @smoke @regression
    Scenario: Verify that user should login and logout successfully
    Given     I am on homepage
    When      I click on 'MyAccountTab' link
    And       I select "Login" option from my accounts dropdown list
    And       I enter email address as "karan25johar@gmail.com"
    And       I enter password as "9081811670@Dv"
    And       I click on 'Login' button
    And       I click on 'MyAccountTab' link
    And       I select option from My account options as "Logout"
    Then      I verify "Account Logout" text on account page