package bank.repository;

import bank.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerStore {

    public boolean hasExistingCustomer(String name) {
        return false;
    }

    public Customer addNewCustomer(Customer customer) {
        return customer;
    }

    public Customer find(String name) {
        return null;
    }
}
