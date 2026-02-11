package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundExampleSteps {

	@Given("precondition1")
	public void precondition1() {
	   System.out.println("Precondition 1");
	}

	@Given("precondition2")
	public void precondition2() {
		System.out.println("Precondition 2");
	}

	@When("test step1")
	public void test_step1() {
		System.out.println("Test step 1");
	}

	@When("test step2")
	public void test_step2() {
		System.out.println("Test step 2");
	}

	@Then("validation step1")
	public void validation_step1() {
		System.out.println("Validation step 1");
	}

	@Then("validation step2")
	public void validation_step2() {
		System.out.println("Validation step 2");
	}

	@When("test step3")
	public void test_step3() {
		System.out.println("Test step 3");
	}

	@When("test step4")
	public void test_step4() {
		System.out.println("Test step 4");
	}

	@Then("validation step3")
	public void validation_step3() {
		System.out.println("Validation step 3");
	}

	@Then("validation step4")
	public void validation_step4() {
		System.out.println("Validation step 4");
	}
	
	@When("test Step1 with firstName {string} and lastName {string}")
	public void test_step1_with_first_name_and_last_name(String firstName, String lastName) {
		System.out.println("Running test Step1 with firstName " + firstName + " and lastName " + lastName);
	}

}
