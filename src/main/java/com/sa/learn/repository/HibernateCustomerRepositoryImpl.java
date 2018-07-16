package com.sa.learn.repository;

import java.util.ArrayList;
import java.util.List;

import com.sa.learn.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    /* (non-Javadoc)
     * @see com.sa.learn.repository.CustomerRepository#findAll()
     */
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstname("Navneet");
        customer.setLastname("Vishwakarma");

        customers.add(customer);

        return customers;
    }

}
