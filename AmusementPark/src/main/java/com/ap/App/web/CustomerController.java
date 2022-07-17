package com.ap.App.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.App.Entity.Customer;
import com.ap.App.service.ICustomerService;

@RestController
@RequestMapping("/customerprofile")
public class CustomerController {
	
	@Autowired
	ICustomerService cus;
	
	@PostMapping("/customer")
	public Customer insertCustomer(@RequestBody Customer c)
	{
		
		return cus.insertCustomer(c);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId)
	{
		return cus.deleteCustomer(customerId);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer c)
	{
		return cus.updateCustomer(c);
	}
	@GetMapping("/profile")
	public Customer viewCustomer(@RequestParam int customerId)
	{
		return cus.viewCustomer(customerId);
	}
	@GetMapping("/customerlist")
	public List<Customer> viewCustomers()
	{
		return cus.viewCustomers();
	}
}
