package com.ap.App;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ap.App.Entity.Customer;
import com.ap.App.service.CustomerServiceImpl;


@SpringBootTest
public class CustomerTest {
	@Mock
	CustomerServiceImpl customerservice;
	
	 @Test
	    void  insertCustomerTest()
	    {
	    	Customer customer=new Customer();
	    	when(customerservice.insertCustomer(customer)).thenReturn(customer);
	    	assertEquals(customer, customerservice.insertCustomer(customer));
	    	
	    }
	 @Test
	    void deleteCustomerTest()
	    {
	    	Customer customer=new Customer();
			customer.setCustomerId(123);
			when(customerservice.deleteCustomer(123)).thenReturn("deleted");
			assertEquals("deleted", customerservice.deleteCustomer(123));
	    }

	 @Test
	    void  updateCustomerTest()
	    {
	    	Customer customer=new Customer();
	    	when(customerservice.updateCustomer(customer)).thenReturn(customer);
	    	assertEquals(customer, customerservice.updateCustomer(customer));
	    	
	    }
	 @Test
	    void viewCustomerstest()
	    {
	    		Customer customer1=new Customer();
	    		Customer customer2=new Customer();
	    		ArrayList<Customer> customer=new ArrayList<Customer>();
	    		customer.add(customer1);
	    		customer.add(customer2);
	    		when(customerservice.viewCustomers()).thenReturn(customer);
	    		assertEquals(customer,customerservice.viewCustomers());
	    }
	 
	 @Test
		void viewCustomertest() 
		{
			Customer customer1=new Customer();
			customer1.setCustomerId(123);
			when(customerservice.viewCustomer(123)).thenReturn(customer1);
			assertEquals(customer1, customerservice.viewCustomer(123));
		}
}
