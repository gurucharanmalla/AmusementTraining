package com.ap.App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.App.Entity.Customer;
import com.ap.App.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerRepository customer;
	

	@Override
	public Customer insertCustomer(Customer c) {
		
		return customer.save(c);
	}

	@Override
	public Customer viewCustomer(int customerId) {
		
		 return customer.findById(customerId).get();
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return customer.save(c);
	}

	

	@Override
	public List<Customer> viewCustomers() {
        List<Customer> custlist=(List<Customer>) customer.findAll();
		
		if(custlist.size()==0) {
			return null;
		}
		return custlist;
	}

	@Override
	public String deleteCustomer(int customerId) {
		customer.deleteById(customerId);
		return "Customer Deleted";
	}

}
