$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("accountloginpagetest.feature");
formatter.feature({
  "line": 1,
  "name": "Account Login Page",
  "description": "As a user I want to check Account login page functionality",
  "id": "account-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7098824700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should navigate to login page successfully",
  "description": "",
  "id": "account-login-page;verify-user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \u0027MyAccountTab\u0027 link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select \"Login\" option from my accounts dropdown list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify \"Returning Customer\" text on account login page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 106601100,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginTestSteps.iClickOnMyAccountTabLink()"
});
formatter.result({
  "duration": 110768600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 10
    }
  ],
  "location": "AccountLoginTestSteps.iSelectOptionFromMyAccountsDropdownList(String)"
});
formatter.result({
  "duration": 543813800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Returning Customer",
      "offset": 10
    }
  ],
  "location": "AccountLoginTestSteps.iVerifyTextOnAccountLoginPage(String)"
});
formatter.result({
  "duration": 59840000,
  "status": "passed"
});
formatter.uri("accountregisterpagetest.feature");
formatter.feature({
  "line": 1,
  "name": "Account Register Page",
  "description": "As a user I want to check Account register page functionality",
  "id": "account-register-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4792738300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should navigate to login page successfully",
  "description": "",
  "id": "account-register-page;verify-user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on \u0027MyAccountTab\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select \"Register\" option from my accounts dropdown list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I verify \"Register Account\" text on account register page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 26800,
  "status": "passed"
});
formatter.match({
  "location": "AccountLoginTestSteps.iClickOnMyAccountTabLink()"
});
formatter.result({
  "duration": 84262500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 10
    }
  ],
  "location": "AccountLoginTestSteps.iSelectOptionFromMyAccountsDropdownList(String)"
});
formatter.result({
  "duration": 905502000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register Account",
      "offset": 10
    }
  ],
  "location": "AccountRegisterTestSteps.iVerifyTextOnAccountRegisterPage(String)"
});
formatter.result({
  "duration": 51207800,
  "status": "passed"
});
formatter.uri("desktopspagetest.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops Page",
  "description": "As a user I want to check Desktops page functionality",
  "id": "desktops-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5248760600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify product arranged in alphabetical order",
  "description": "",
  "id": "desktops-page;verify-product-arranged-in-alphabetical-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select currency as \"£Pound Sterling\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover on \u0027Desktops\u0027 link and click",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select menu as \"Show AllDesktops\" from top menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select sort by option as \"Name (Z - A)\" on desktops page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify elements are sorted in reverse order",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 28600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "£Pound Sterling",
      "offset": 22
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectCurrencyAs(String)"
});
formatter.result({
  "duration": 988924700,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestSteps.iMouseHoverOnDesktopsLinkAndClick()"
});
formatter.result({
  "duration": 208371600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show AllDesktops",
      "offset": 18
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectMenuAsFromTopMenu(String)"
});
formatter.result({
  "duration": 1735400600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z - A)",
      "offset": 28
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectSortByOptionAsOnDesktopsPage(String)"
});
formatter.result({
  "duration": 813284600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestSteps.iVerifyElementsAreSortedInReverseOrder()"
});
formatter.result({
  "duration": 599338300,
  "status": "passed"
});
formatter.uri("laptopsandnotebookstest.feature");
formatter.feature({
  "line": 1,
  "name": "Laptops and Notebooks page",
  "description": "As a user I want to check laptops and notebooks page functionality",
  "id": "laptops-and-notebooks-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6146030100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify products price display high to low successfully",
  "description": "",
  "id": "laptops-and-notebooks-page;verify-products-price-display-high-to-low-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on \u0027Laptops and notebooks\u0027 link and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select menu as \"Show AllLaptops \u0026 Notebooks\" from top menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by option as \"Price (High \u003e Low)\" on desktops page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify products are arranged in reverse order",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 84000,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iMouseHoverOnLaptopsAndNotebooksLinkAndClick()"
});
formatter.result({
  "duration": 636727600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show AllLaptops \u0026 Notebooks",
      "offset": 18
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectMenuAsFromTopMenu(String)"
});
formatter.result({
  "duration": 1490799700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (High \u003e Low)",
      "offset": 28
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectSortByOptionAsOnDesktopsPage(String)"
});
formatter.result({
  "duration": 648155600,
  "status": "passed"
});
formatter.match({
  "location": "LaptopsAndNotebooksTestSteps.iVerifyProductsAreArrangedInReverseOrder()"
});
formatter.result({
  "duration": 341625800,
  "status": "passed"
});
formatter.uri("topmenutest.feature");
formatter.feature({
  "line": 1,
  "name": "Top menu test",
  "description": "As a user I want to check Top menu functionality",
  "id": "top-menu-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7272973100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should navigate to desktops page successfully",
  "description": "",
  "id": "top-menu-test;verify-user-should-navigate-to-desktops-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on \u0027Desktops\u0027 link and click",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select menu as \"Show AllDesktops\" from top menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify the title as \"Desktops\" on desktops page",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountLoginTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 36100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopsPageTestSteps.iMouseHoverOnDesktopsLinkAndClick()"
});
formatter.result({
  "duration": 310329700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Show AllDesktops",
      "offset": 18
    }
  ],
  "location": "DesktopsPageTestSteps.iSelectMenuAsFromTopMenu(String)"
});
formatter.result({
  "duration": 1838239300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Desktops",
      "offset": 23
    }
  ],
  "location": "TopMenuTestSteps.iVerifyTheTitleAsOnDesktopsPage(String)"
});
formatter.result({
  "duration": 56150500,
  "status": "passed"
});
});