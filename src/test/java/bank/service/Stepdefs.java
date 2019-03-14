package bank.service;

import org.junit.Assert;

import bank.entity.Customer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	
	BankingService bankingService = new BankingService();
	
	@Given("{string} is not a bank customer yet")
	public void customer_does_not_have_account_yet(String name) {
		Customer customer = bankingService.getCustomer(name);
		Assert.assertNull(customer);
	}

	@When("a {string} asks to open an account.")
	public void customer_creates_an_account(String name) {
		Customer customer = bankingService.createNewCustomer(name);
		Assert.assertTrue(customer != null);
	}

	@Then("a customer object is created for the bank.")
	public void customer_has_an_account(String name) {
		Customer customer = bankingService.getCustomer(name);
		Assert.assertTrue(customer != null);
	}
}
