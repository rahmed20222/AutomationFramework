Feature: Google Search
Scenario: Searching Multiple items and validating 
Given I am Google Homepage
Then I search "facebook"
Then I click on facebook from search suggestion
Then Searching should be successful
Given I am Google Homepage
Then I search "Amazon"
Then I click on facebook from search suggestion
Then Searching should be successful
Given I am Google Homepage
Then I search "Instagram"
Then I click on facebook from search suggestion
Then Searching should be successful