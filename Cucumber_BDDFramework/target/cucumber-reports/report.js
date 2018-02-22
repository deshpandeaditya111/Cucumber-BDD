$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "testusergitub",
        "Abcd@1234"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 9089507280,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 1193591991,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.user_enters_testuser_and_Test(Credentials\u003e)"
});
formatter.result({
  "duration": 2016819649,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 166325,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Logout",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User Logout from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Message displayed Logout Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps.user_Logout_from_the_Application()"
});
formatter.result({
  "duration": 3681282736,
  "status": "passed"
});
formatter.match({
  "location": "Test_Steps.message_displayed_Logout_Successfully()"
});
formatter.result({
  "duration": 104746,
  "status": "passed"
});
});