package bank.service;

import bank.FakeCustomerStore;
import bank.entity.Account;
import bank.entity.Customer;
import cucumber.api.java8.En;
import org.junit.Assert;

public class AccountStepDefs implements En {


	public AccountStepDefs() {
		BankingService bankingService = new BankingService();
		bankingService.setCustomerStore(new FakeCustomerStore());
		bankingService.createCustomer("Byron");

		Given("Byron now has an account", () -> {
			// Write code here that turns the phrase above into concrete actions
			Customer byron = bankingService.getCustomer("Byron");
			Assert.assertNotNull(byron);
			Assert.assertEquals("Byron", byron.getName());
		});

		When("Byron deposits {int} into his account", (Integer int1) -> {
			// Write code here that turns the phrase above into concrete actions
			Customer byron = bankingService.getCustomer("Byron");
			Account account = byron.getAccount();
			account.deposit(100.00);
		});

		Then("the {int} is equal to {int}", (Integer int1, Integer int2) -> {
		    // Write code here that turns the phrase above into concrete actions
			Customer byron = bankingService.getCustomer("Byron");
			Account account = byron.getAccount();
		    double balance = account.getBalance();
		    Assert.assertEquals(100.00d, balance, 0.00);
		});
	}
}
