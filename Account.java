package wemanibank.retail.entities;

import java.util.Calendar;

import javax.persistence.Entity;

@Entity(name="ACCOUNTS")
public class Account {
	private double balance;
	private Calendar asOfDate;
}
