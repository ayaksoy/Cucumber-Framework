package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {

	@When("I login with {string} and {string}")
	public void i_login_with_and(String username, String password) {
		System.out.println("Login with " + username + " and " + password);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("Click the login button");
	}

	@Then("I validate that {string} is displayed")
	public void i_validate_that_is_displayed(String username) {
		System.out.println("Validate that the " + username + " is displayed");
	}

	@Then("I print {string} on the screen")
	public void i_print_on_the_screen(String fullName) {
		System.out.println("Bye " + fullName);
	}

}
