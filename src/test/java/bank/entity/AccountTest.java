package bank.entity;

import java.util.List;

import org.junit.Assert;
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

	@Test // Retrieve a statement of the account.
	public void testAccountStatement() {
		Account account = new Account();
		account.deposit(10.0);
		account.withdraw(5.0);
		Statement statement = account.getStatement();
		List<Ledger.Entry> operations = statement.getOperations();
		Assert.assertTrue(operations.size() == 2);
		Ledger.Entry first = operations.get(0);
		Assert.assertTrue(first.getDeposit() == 10.0);
		Ledger.Entry second = operations.get(1);
		Assert.assertTrue(second.getWithdrawal() == 5.0);
	}
}
