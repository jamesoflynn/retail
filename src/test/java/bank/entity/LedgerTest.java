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
}
