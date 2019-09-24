package bank.entity;

public class Customer {

	private String name;
	private Account account;

	public Customer(String name) {
		this.name = name;
		this.account = new Account();
	}

	public String getName() { return name;}
	public Account getAccount() {
		return account;
	}
}
