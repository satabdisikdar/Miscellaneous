@google
Feature: Basic practice

  Scenario: Open google and check
    Given I am on "splitwise" page
    When I click on "signUp"
    Then I see "Introduce yourself" in the page
