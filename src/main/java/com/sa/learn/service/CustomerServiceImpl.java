package com.sa.learn.service;

import java.util.List;

import com.sa.learn.model.Customer;
import com.sa.learn.repository.CustomerRepository;
import com.sa.learn.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    /* (non-Javadoc)
     * @see com.sa.learn.service.CustomerService#findAll()
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
