package com.ap.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Ticket {
	
	private int ticketId;
	private Customer customer;
	private Activity activity;
	private LocalDateTime date;
}
