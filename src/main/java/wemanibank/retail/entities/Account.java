package wemanibank.retail.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import wemanibank.retail.AccountException;

@Entity(name="ACCOUNTS")
public class Account {
	@Id
	private Integer accountNumber;
	@Column(name="BALANCE")
	private double balance;
	@Column(name="ASOFDATE")
	private Calendar asOfDate;
	

	public void deposit(double amount) throws AccountException {
		
	}

	public void withdraw(double amount) throws AccountException {
		if (amount > balance) {
			
		}
	}
}
