Feature: CheaoOAir Website
@CheapOAir
Scenario: Searching some flights
Given I am on CheapOAir Website
Then I close the suggested departing airport
Then I search Departing Airport as "Texas"
Then I select the first suggested airport
And I Refresh the page
Then I close the suggested departing airport
Then I search Departing Airport as "California"
Then I select the first suggested airport
And I Refresh the page
Then I close the suggested departing airport
Then I search Departing Airport as "New York"
Then I select the first suggested airport
And I Refresh the page
Then I close the suggested departing airport
Then I search Departing Airport as "New jersey"
Then I select the first suggested airport
And I Refresh the page
Then I close the suggested departing airport
Then I search Departing Airport as "Illinios"
Then I select the first suggested airport
And I Refresh the page
 