package bank.entity;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class AccountTest {


	@Test // Test that we can deposit money into an Account.
	public void testAccountDeposit() {
		Account account = new Account();
		double amount = account.deposit(10.0);
		Assert.assertEquals(10.0, amount, 0.0d);
	}

	@Test // test that we can withdraw money from an account.
	public void testAccoundWithdrawal() {
		Account account = new Account();
		account.deposit(20.0);
		double amount = account.withdraw(10.0);
		Assert.assertEquals(10.0,amount, 0.0);
	}

	@Test // Retrieve a statement of the account.
	public void testAccountStatement() {
		Account account = new Account();
		account.deposit(10.0);
		account.withdraw(5.0);
		Statement statement = account.getStatement();
		List<Ledger.Entry> operations = statement.getOperations();
		Assert.assertEquals(2, operations.size());
		Ledger.Entry first = operations.get(0);
		Assert.assertEquals(10.0, first.getDeposit(), 0.0);
		Ledger.Entry second = operations.get(1);
		Assert.assertEquals(5.0, second.getWithdrawal(), 0.0);
	}
}
