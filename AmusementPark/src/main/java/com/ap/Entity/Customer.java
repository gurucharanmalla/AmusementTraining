package com.ap.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Customer extends User{
	
	private int customerId;
}
