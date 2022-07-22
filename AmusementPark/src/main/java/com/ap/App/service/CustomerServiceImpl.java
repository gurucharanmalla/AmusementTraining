package com.ap.App.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.App.Entity.Customer;
import com.ap.App.repository.ICustomerRepository;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerRepository customer;
	@Autowired
	EntityManager entityManager;

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

	@Override
	public Customer validateCustomer(String username,String password){
Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Customer b where b.username=:username and b.password=:password";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setString("username",username);
		query.setString("password",password);
		Customer b=query.getSingleResult();

		return b;
	}

}
