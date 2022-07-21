package com.ap.App.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Data
@Table(name="Ticket")
public class Ticket {

	@Id
	private int ticketId;
	
	private LocalDateTime date;
	

	@OneToOne
	private Activity activity;
	
	@ManyToOne
	private Customer customer;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public LocalDateTime getDate()
	{
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
	
}
