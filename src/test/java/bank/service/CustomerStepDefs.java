package bank.service;

import cucumber.api.java8.En;

public class CustomerStepDefs implements En {

    BankingService bankingService = new BankingService();

    public CustomerStepDefs() {
        Given("A customer with Byron is not a bank customer yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        When("Byron asks to open an account.", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("a customer object for Byron is created for the bank.", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });
    }
}
