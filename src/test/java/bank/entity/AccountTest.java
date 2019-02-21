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

	@Test // test that we can withdraw money from an account.
	public void testAccoundWithdrawal() {
		Account account = new Account();
		account.deposit(20.0);
		double amount = account.withdraw(10.0);
		Assert.assertTrue(amount == 10.0);
	}
}
