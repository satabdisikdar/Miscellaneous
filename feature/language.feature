
Feature: To change the language

Scenario: Change from english to KN

Given I open amazon url
Then I am on homepage
When I click on flag icon
Then I see languages dropdown
When I select "KN" from the list
Then Page language changes to Kannada
