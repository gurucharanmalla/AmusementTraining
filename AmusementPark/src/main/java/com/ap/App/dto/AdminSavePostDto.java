package com.ap.App.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class AdminSavePostDto {

	@Id
	@SequenceGenerator(name="mylogicdto",initialValue=11,allocationSize=2)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogicdto")
	private int adminId;
	private String username;
	private String password;
	private String address;
	private String mobileNumber;
	private String email;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", address="
				+ address + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
}
