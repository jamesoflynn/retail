package bank.service;

import org.springframework.stereotype.Service;

import bank.entity.Account;
import bank.entity.Bank;
import bank.entity.Customer;

@Service
public class BankingService {

	public Customer createNewCustomer(String name) {
		return Bank.createNewCustomer(name);
	}

	public Customer getCustomer(String name) {
		return Bank.getCustomer(name);
	}

	public double deposit(Account account, double amount) {
		return 0.0;
	}
}
