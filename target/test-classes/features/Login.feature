@test
Feature: Log into American Airlines mobile android application

  @setup
  Scenario Outline: Log in
    Given I log into the app
    And I click Get Started button
    Then I click continue with email button
    And I validate directed to email page
    Then I click email field
    And I want to filled the <email> field
    Then I click continue button
    And I want to filled the <password>field
    Then I click continue button
    And I enter my pin <pin>
    Then I successfully logged in

    Examples:
      | email           |password|pin|
      |qa-trade@usenobi.com |Pass@word3|147258147258|
