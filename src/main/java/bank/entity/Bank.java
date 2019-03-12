package bank.entity;

import java.util.HashMap;

public class Bank {
	private HashMap<String, Customer> customers;
	private static Bank self;

	static {
		self = new Bank();
	}

	private Bank() {
		customers = new HashMap<>();
	}

	public static Customer createNewCustomer(String name) {
		Customer customer = null;
		if (!self.customers.containsKey(name)) {
			customer = new Customer(name);
			self.customers.put(name, customer);
		}
		return customer;
	}
}
