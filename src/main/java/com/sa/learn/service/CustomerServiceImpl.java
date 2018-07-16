package com.sa.learn.service;

import java.util.List;

import com.sa.learn.model.Customer;
import com.sa.learn.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /* (non-Javadoc)
     * @see com.sa.learn.service.CustomerService#findAll()
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
