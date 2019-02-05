package wemanibank.retail;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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

	private static final String CUSTOMER_SELECT = "select cust from CUSTOMERS c where c.userName=(:userName) and c.secret=(:secret)";

	public Customer customerLogin(Customer customer) {
		try {
			TypedQuery<Customer> query = entityManager.createQuery(CUSTOMER_SELECT, Customer.class);
			query.setParameter("userName", customer.getUserName());
			query.setParameter("secret", customer.getSecret());
		}
		catch (Exception e) {
			
		}
		return customer;
	}

	public Account deposit(Account account, double amount) throws AccountException {
		try {
//			account = entityManager
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
