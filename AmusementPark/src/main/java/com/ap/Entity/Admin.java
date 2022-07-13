package com.ap.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Admin extends User{
	
	private int adminId;
	
	
	
}
