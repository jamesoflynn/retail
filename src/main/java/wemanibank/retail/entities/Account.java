package wemanibank.retail.entities;

import java.util.Calendar;

import javax.persistence.Entity;

import wemanibank.retail.AccountException;

@Entity(name="ACCOUNTS")
public class Account {
	private double balance;
	private Calendar asOfDate;

	public void deposit(double amount) throws AccountException {
		
	}

	public void withdraw(double amount) throws AccountException {
		if (amount > balance) {
			
		}
	}
}
