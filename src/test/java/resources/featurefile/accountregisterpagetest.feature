Feature: Account Register Page
  As a user I want to check Account register page functionality

  @sanity @regression
  Scenario: Verify user should navigate to login page successfully
    Given   I am on homepage
    And    I click on 'MyAccountTab' link
    When    I select "Register" option from my accounts dropdown list
    Then    I verify "Register Account" text on account register page

    @smoke @regression
      Scenario: Verify that user should login and logout successfully
      When      I click on 'MyAccountTab' link
      And       I select "Register" option from my accounts dropdown list
      And       I enter first name as "Karunaa"
      And       I enter last name as "Koradiya"
      And       I enter email as "karunaaiia28virani@gmail.com"
      And       I enter telephone as "07436252668"
      And       I enter password as "9081811670@Dv" on account register page
      And       I enter confirm password as "9081811670@Dv"
      And       I select subscription as "Yes"
      And       I click on 'Privacy Policy' checkbox
      And       I click on 'Continue' button on account register page
      Then      I verify account created text "Your Account Has Been Created!"  on account page
      When      I click on 'Continue' button
      And       I click on 'MyAccountTab' link
      And       I select option from My account options as "Logout"
      Then      I verify "Account Logout" text on account page
      And       I click on 'Continue' button
