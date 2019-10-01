package bank.service;

import bank.FakeCustomerStore;
import bank.entity.Customer;
import cucumber.api.java8.En;
import org.junit.Assert;

public class CustomerStepDefs implements En {


    public CustomerStepDefs() {
        BankingService bankingService = new BankingService();
        bankingService.setCustomerStore(new FakeCustomerStore());
        Given("A customer with Byron is not a bank customer yet", () -> {
            // Write code here that turns the phrase above into concrete actions
            Customer byron = bankingService.getCustomer("Byron");
            Assert.assertNull(byron);
        });

        When("Byron asks to open an account.", () -> {
            // Write code here that turns the phrase above into concrete actions
            Customer byron = bankingService.createCustomer("Byron");
            Assert.assertNotNull(byron);
            Assert.assertEquals("Byron", byron.getName());
        });

        Then("a customer object for Byron is created for the bank.", () -> {
            // Write code here that turns the phrase above into concrete actions
            Customer byron = bankingService.getCustomer("Byron");
            Assert.assertNotNull(byron);
            Assert.assertEquals("Byron", byron.getName());
        });
    }
}
