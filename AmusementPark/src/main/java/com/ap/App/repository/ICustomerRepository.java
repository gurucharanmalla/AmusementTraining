package com.ap.App.repository;

import org.springframework.data.repository.CrudRepository;

import com.ap.App.Entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer>{

}
