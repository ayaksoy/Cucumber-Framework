Feature: Scenario with DataTable

	@dataTable
	Scenario: Add employees with DataTable
		When I login to HRM application
		And I want to add Employees
			| FirstName	| MiddleName	| LastName	|
			|	Maya	| Gizem	| C.	|
			| Ciara	| M.	| B.	|
			| Burak	| C.	| Busche	|
		Then I validate employee is added
	