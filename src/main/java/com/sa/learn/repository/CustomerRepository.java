package com.sa.learn.repository;

import java.util.List;

import com.sa.learn.model.Customer;

public interface CustomerRepository {

    List<Customer> findAll();

}