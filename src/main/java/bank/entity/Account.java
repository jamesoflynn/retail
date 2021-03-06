package bank.entity;

import java.time.LocalDateTime;
import java.util.List;

import bank.entity.Ledger.Entry;

public class Account {

	private double balance;
	private Ledger ledger;
	private LocalDateTime asOfDate;

	public Account() {
		balance = 0.0d;
		ledger = new Ledger();
	}

	public double deposit(double amount) {
		if (amount > 0) {
			double added = ledger.deposit(amount);
			if (added == amount) {
				balance += added;
				asOfDate = LocalDateTime.now();
			}
		}
		return balance;
	}

	public double withdraw(double amount) {
		double withdrawn = 0.0d;
		if (amount <= balance) {
			withdrawn = ledger.withdraw(amount);
			balance -= withdrawn;
			asOfDate = LocalDateTime.now();
		}
		return withdrawn;
	}

	public double getBalance() {
		return balance;
	}

	public Statement getStatement() {
		Statement statement = Statement.newStatement(this);
		return statement;
	}

	public List<Entry> getEntries() {
		return ledger.getEntries();
	}
}
