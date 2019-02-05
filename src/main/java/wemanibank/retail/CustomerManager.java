package wemanibank.retail;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import wemanibank.retail.entities.Account;
import wemanibank.retail.entities.Customer;

@Component
public class CustomerManager {

	private EntityManager entityManager;
	private Map properties;

	public CustomerManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("wemanibank", properties);
		entityManager = emf.createEntityManager();
	}

	public Customer customerLogin(Customer customer) {
		customer = entityManager.find(Customer.class, customer);
		return customer;
	}

	public Account deposit(Account account, double amount) throws AccountException {
		try {
			account = entityManager.find(Account.class, account);
			account.deposit(amount);
		}
		catch(Exception e) {
			
		}
		return account;
	}

	public Account withdraw(Account account, double amount) throws AccountException {
		try {
			account = entityManager.find(Account.class, account);
			account.withdraw(amount);
		}
		catch(Exception e) {
			
		}
		return account;		
	}
}
