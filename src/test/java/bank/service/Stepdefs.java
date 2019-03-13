package bank.service;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {
	
	@Given("{string} is not a bank customer yet")
	public void customer_does_not_have_account_yet() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("a {string} asks to open an account.")
	public void customer_creates_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("a customer object is created for the bank.")
	public void customer_has_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
