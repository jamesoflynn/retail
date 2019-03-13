package bank.entity;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

	@Test // User Story 1 continued. As a Customer, I have an Account, into which I can Deposit or Withdraw Money.
	public void testCustomer() {
		Customer customer = new Customer("Aaron");
		Account account = customer.getAccount();
		double balance = account.deposit(10.0);
		Assert.assertTrue(balance == 10.0);
		double withdrawn = account.withdraw(5.0);
		Assert.assertTrue(withdrawn == 5.0);
	}

}