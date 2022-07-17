package com.ap.App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ap.App.Entity.Customer;

@Service
public interface ICustomerService {
	public Customer insertCustomer(Customer c);
	public Customer viewCustomer(int customerId);
	public Customer updateCustomer(Customer c);
	public String deleteCustomer(int customerId);
	public List<Customer> viewCustomers();

}
