package com.ap.App.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ap.App.Entity.Ticket;

@Service
public interface ITicketBookingService {
	
	public Ticket insertTicketBooking(Ticket ticket);
	public Ticket updateTicketBooking(Ticket ticket);
	public Ticket deleteTicketBooking(int ticketId);
	public List<Ticket> viewAllTickets(int customerId);
	public double calculateBill(int customerId);
	public Optional<Ticket> getTicketDetails(int ticketId);
}
