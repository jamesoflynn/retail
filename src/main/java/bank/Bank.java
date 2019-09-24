package bank;

public class Bank {
	private static Bank self;

	static {
		self = new Bank();
	}

	private Bank() {}
}