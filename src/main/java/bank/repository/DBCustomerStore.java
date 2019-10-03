package bank.repository;

import bank.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class DBCustomerStore implements CustomerStore {

    @Autowired
    EntityManager entityManager;

//    @Value("bank.entity.customer.find")
//    private static String searchQuery;

    public DBCustomerStore(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public boolean hasExistingCustomer(String name) {
        return false;
    }

    public Customer addNewCustomer(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    public Customer find(String name)
    {
        Query query = entityManager.createQuery("SELECT c from Customer WHERE c.name = :name");
        query.setParameter("name", name);
        Customer customer = (Customer)query.getSingleResult();
        return customer;
    }
}
