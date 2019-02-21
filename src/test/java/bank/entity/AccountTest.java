package bank.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest extends TestCase {


	@Test // Test that we can deposit money into an Account.
	public void testAccountDeposit() {
		Account account = new Account();
		double amount = account.deposit(10.0);
		Assert.assertTrue(amount == 10.0);
	}
}