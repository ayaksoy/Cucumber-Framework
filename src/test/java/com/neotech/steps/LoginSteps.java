package com.neotech.steps;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("I navigate to HRM website")
	public void i_navigate_to_hrm_website() {
		setUp();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}

	@When("I click the submit button")
	public void i_click_the_submit_button() {
		click(loginPage.loginButton);
	}

	@Then("I validate that i am logged in")
	public void i_validate_that_i_am_logged_in() {
		String expected = "Jacqueline White";
		String actual = dashboardPage.accountName.getText();

		if (expected.equals(actual)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}
	}

	@Then("I quit the browser")
	public void i_quit_the_browser() {
		tearDown();
	}
	
	@When("I enter an invalid password")
	public void i_enter_an_invalid_password()
	{
		sendText(loginPage.password, "invalid password");
	}
	
	
	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed()
	{
		String expected = "Invalid Credentials";
		String actual = loginPage.invalidPassword.getText();
		
		if (actual.equals(expected))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
		}
	}
	
	
}
