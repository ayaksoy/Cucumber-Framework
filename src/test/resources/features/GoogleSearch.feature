@GoogleSearch
Feature: Searching in Google

	@smoke @regression
	Scenario: Search by typing
					Given I navigated to google.com
					When I type something in the search box
					And I click on the search button
					Then I can see the resuults of my search
					And I want to see the number of search results
					
	@regression
	Scenario: Search by voice
					Given I navigated to google.com
					When I say what i want to search for
					Then I can see the resuults of my search
					And I want to see the number of search results