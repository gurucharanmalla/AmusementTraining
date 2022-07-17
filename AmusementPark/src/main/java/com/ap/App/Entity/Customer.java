package com.ap.App.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@SequenceGenerator(name="mylogic1",initialValue=11,allocationSize=2)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic1")
	private int customerId;
	private String username;
	private String password;
	private String address;
	private String mobileNumber;
	private String email;
	public Customer() {
		super();
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", username=" + username + ", password=" + password + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	public Customer(int customerId, String username, String password, String address, String mobileNumber,
			String email) {
		super();
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
}
