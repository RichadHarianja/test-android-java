@test
Feature: Log into American Airlines mobile android application

@setup
Scenario Outline: Log in
  Given I log into the app
  Then I want to filled the <email> field

  Examples:
  | email           |
  | email@gmail.com |