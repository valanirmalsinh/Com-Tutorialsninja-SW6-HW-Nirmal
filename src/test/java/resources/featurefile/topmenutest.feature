Feature: Top menu test
  As a user I want to check Top menu functionality

  @sanity @regression
    Scenario: Verify user should navigate to desktops page successfully
    Given     I am on homepage
    When      I mouse hover on 'Desktops' link and click
    And       I select menu as "Show AllDesktops" from top menu
    Then      I verify the title as "Desktops" on desktops page

  @smoke @regression
  Scenario: Verify user should navigate to laptops and notebooks page successfully
    Given     I am on homepage
    When      I mouse hover on 'Laptops and notebooks' link and click
    And       I select menu as "Show AllLaptops & Notebooks" from top menu
    Then      I verify the title as "Laptops & Notebooks" on laptops and notebooks page

   @regression
  Scenario: Verify user should navigate to components page successfully
    Given     I am on homepage
    When      I mouse hover on 'Components' link and click
    And       I select menu as "Show AllComponents" from top menu
    Then      I verify the title as "Components" on components page