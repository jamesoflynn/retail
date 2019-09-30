package bank;

import bank.entity.Customer;
import bank.repository.CustomerStore;

import java.util.HashMap;

public class FakeCustomerStore extends CustomerStore {

    private HashMap<String, Customer> customers;

    public FakeCustomerStore() {
        customers = new HashMap<>();
    }

    public Customer find(String name) {
        return customers.get(name);
    }

    public Customer addNewCustomer(Customer customer) {
        if (!customers.containsKey(customer.getName())) {
            customers.put(customer.getName(), customer);
        }
        return customer;
    }
}
