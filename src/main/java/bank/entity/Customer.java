package bank.entity;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="customerId")
	private int customerId;

	@Column(name="name")
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
