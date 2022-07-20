package com.ap.App.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.App.Entity.Ticket;
import com.ap.App.service.ITicketBookingService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	ITicketBookingService ticketservice;
	
	
	@GetMapping("/{ticketId}")
	private Optional<Ticket> getTicket(@PathVariable int ticketId)
	{
		return ticketservice.getTicketDetails(ticketId);
	}
	
	
	@PostMapping("/save")
	private Ticket  insertTicket(@RequestBody Ticket t)
	{
		return ticketservice.insertTicketBooking(t);
	}
	
	@PutMapping("/update")
	private boolean updateTicket(@RequestBody Ticket t) {
		
		ticketservice.updateTicketBooking(t);
		return true;
		
	}
	
	@GetMapping("/tickets/{customerId}")
	private List<Ticket> viewAllTIckets(@PathVariable int customerId){
		
		return ticketservice.viewAllTickets(customerId); 
	}
	
	@DeleteMapping("/{ticketId}")
	private void deleteTicket(@PathVariable int ticketId) {
		
		 ticketservice.deleteTicketBooking(ticketId);
	}
	
	@GetMapping("/{ticketId}/bill")
	private double getBill(@PathVariable int ticketId) {
		return ticketservice.calculateBill(ticketId);
	}
	
	
	
	
	
	
	
}
