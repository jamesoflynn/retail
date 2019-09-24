package bank.entity;

import bank.Bank;
import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class BankTest extends TestCase {

	@Test
	public void testCreateNewCustomer() {
		Customer customer = Bank.createNewCustomer("Aaron");
		Assert.assertNotNull(customer);
	}

	@Test
	public void testGetCustomer() {
		Bank.createNewCustomer("Barack");
		Customer customer = Bank.getCustomer("Barack");
		Assert.assertNotNull(customer);
	}
	
}
