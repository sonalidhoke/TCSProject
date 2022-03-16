Feature: facebook login feature

Scenario: facebook login test scenario

Given User is allready on login page
When title of login page is facebook
Then user enters username and password
Then user click on login button
And user is on home page
