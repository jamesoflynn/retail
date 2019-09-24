package bank.service;

import cucumber.api.java8.En;

public class AccountStepDefs implements En {

	public AccountStepDefs() {
		Given("Byron now has an account", () -> {
			// Write code here that turns the phrase above into concrete actions
			throw new cucumber.api.PendingException();
		});

		When("Byron deposits {int} into his account", (Integer int1) -> {
			// Write code here that turns the phrase above into concrete actions
			throw new cucumber.api.PendingException();
		});

		Then("the {int} is equal to {int}", (Integer int1, Integer int2) -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});
	}
}
