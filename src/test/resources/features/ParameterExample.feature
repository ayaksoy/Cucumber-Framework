@parameter
Feature: Background keyword example 

	Background:
		Given precondition1
		And precondition2

	Scenario: Example1
		When test Step1 with firstName "Faizan" and lastName "Arshad"
		And test step2 
		Then validation step1 
		And validation step2 
		
	Scenario: Example2
		When test step3 
		And test step4 
		Then validation step3 
		And validation step4 
		
#-------------- Order of execution 

#Hooks   ----> @Before 
#Background steps 
#Scenario 1 (Example1)
#Hooks ----> @After
#---------------
#Hooks   ----> @Before 
#Background steps 
#Scenario 2 (Example2)
#Hooks ----> @After