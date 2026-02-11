Feature: Scenario Outline Example

@outline
Scenario Outline:
	 When I login with "<username>" and "<password>"
	 And I click on login button
	 Then I validate that "<username>" is displayed
	 And I print "<fullName>" on the screen
	 
	Examples:
		|	username	|	password	|	fullName	|
		| ozzy	|	ozzy1234	| Oguzhan |
		|	maya	| maya1234	| Maya |
		|	leonardo	| leo1234	| Leonardo |
		