package com.ap.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Activity {

	private int activityId;
	private String description;
	private float Charges;
	
	
}
