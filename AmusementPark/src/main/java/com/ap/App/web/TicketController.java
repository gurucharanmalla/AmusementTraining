package com.ap.App.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
