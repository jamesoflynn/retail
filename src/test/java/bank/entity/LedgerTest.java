package bank.entity;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class LedgerTest extends TestCase {


	@Test // Refactor of AccountTest
	public void testDeposit() {
		Ledger ledger = new Ledger();
		double amount = ledger.deposit(10.0);
		Assert.assertTrue(amount == 10.0);
	}

	@Test // Not a refactor of AccountTest, as a Ledger entry does not have a balance
	public void testWithdrawal() {
		Ledger ledger = new Ledger();
		double amount = ledger.withdraw(10.0);
		Assert.assertTrue(amount == 10.0);
	}
}
