@Login
Feature: Login Functionality

	@regression
	Scenario: Valid login to HRM
				#	Given I navigate to HRM website
					When I enter a valid username
					And I enter a valid password
					And I click the submit button
					Then I validate that i am logged in
				#	And I quit the browser
	
	@smoke
	Scenario: Invalid login to HRM
				#	Given I navigate to HRM website
					When I enter a valid username
					And I enter an invalid password
					And I click the submit button
					Then I validate that Invalid Credentials is displayed 
				#	And I quit the browser