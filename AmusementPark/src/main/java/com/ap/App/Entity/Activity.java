package com.ap.App.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="Activity")
public class Activity {

	@Id
	@SequenceGenerator(name="mylogic",initialValue=10,allocationSize=2)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic")
	private int activityId;
	private String description;
	private float Charges;
	public Activity(int activityId, String description, float charges) {
		super();
		this.activityId = activityId;
		this.description = description;
		this.Charges = charges;
	}
	
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getCharges() {
		return Charges;
	}
	public void setCharges(float charges) {
		Charges = charges;
	}
	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", description=" + description + ", Charges=" + Charges + "]";
	}
	
	
	
	
}
