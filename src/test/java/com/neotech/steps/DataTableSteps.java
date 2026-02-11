package com.neotech.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {
	@When("I login to HRM application")
	public void i_login_to_hrm_application() {
		System.out.println("Login here...");
	}

	@When("I want to add Employees")
	public void i_want_to_add_employees(DataTable employees) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.

		List<Map<String, String>> employeeList = employees.asMaps();
		for (Map<String, String> employee : employeeList) {
			System.out.println(employee);
			System.out.println("First name: " + employee.get("FirstName"));
			System.out.println("Middle name: " + employee.get("MiddleName"));
			System.out.println("Last name: " + employee.get("LastName"));
		}

	}

	@Then("I validate employee is added")
	public void i_validate_employee_is_added() {
		System.out.println("Validate the employee is added.");
	}

}
