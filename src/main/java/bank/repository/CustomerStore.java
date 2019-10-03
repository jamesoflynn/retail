package bank.repository;

import bank.entity.Customer;

public interface CustomerStore {
    public boolean hasExistingCustomer(String name);

    public Customer addNewCustomer(Customer customer);

    public Customer find(String name);
}
