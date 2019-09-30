package bank.service;

import bank.FakeCustomerStore;
import bank.entity.Customer;
import bank.repository.CustomerStore;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.stubbing.Answer;

import java.util.concurrent.Callable;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class CustomerStepDefs implements En {

    FakeCustomerStore customerStore;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    BankingService bankingService = new BankingService();

    public CustomerStepDefs() {
        Given("A customer with Byron is not a bank customer yet", () -> {
            // Write code here that turns the phrase above into concrete actions
//            Customer byron = bankingService.getCustomer("Byron");
//            Assert.assertNull(byron);
        });

        When("Byron asks to open an account.", () -> {
            // Write code here that turns the phrase above into concrete actions
//            Customer byron = bankingService.createCustomer("Byron");
//            Assert.assertNotNull(byron);
//            Assert.assertEquals("Byron", byron.getName());
        });

        Then("a customer object for Byron is created for the bank.", () -> {
            // Write code here that turns the phrase above into concrete actions
//            Customer byron = bankingService.getCustomer("Byron");
//            Assert.assertNotNull(byron);
//            Assert.assertEquals("Byron", byron.getName());
        });
    }
}
