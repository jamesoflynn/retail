package bank.entity;

public class Account {

	private double balance;

	public Account() {
		balance = 0.0d;
	}

	public double deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		return balance;
	}
}
