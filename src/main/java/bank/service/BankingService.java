package bank.service;

import bank.repository.CustomerStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bank.entity.Account;
import bank.Bank;
import bank.entity.Customer;

@Service
public class BankingService {
	@Autowired
	private CustomerStore customers;

	public Customer createCustomer(String name) {
		Customer customer = null;
		if (!customers.hasExistingCustomer(name)) {
			customer = new Customer(name);
			customers.addNewCustomer(customer);
		}
		return customer;
	}

	public Customer getCustomer(String name) {
		return customers.find(name);
	}

	public double deposit(Account account, double amount) {
		return 0.0;
	}
}
