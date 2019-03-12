package bank.entity;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {

	@Test
	public void testCreateNewCustomer() {
		Customer customer = Bank.createNewCustomer("Aaron");
		Assert.assertNotNull(customer);
	}

}
