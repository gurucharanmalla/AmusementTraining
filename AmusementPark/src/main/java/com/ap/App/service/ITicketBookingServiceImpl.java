package com.ap.App.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.App.Entity.Ticket;
import com.ap.App.repository.ITicketBookingRepo;

@Service
public class ITicketBookingServiceImpl implements ITicketBookingService{

	@Autowired
	ITicketBookingRepo ticketRepo;
	
	@Override
	public Ticket insertTicketBooking(Ticket ticket) {
		
		return ticketRepo.save(ticket);
	}

	@Override
	public Ticket updateTicketBooking(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket deleteTicketBooking(int ticketId) {
		
		ticketRepo.deleteById(ticketId);
		return null;
	}

	@Override
	public List<Ticket> viewAllTickets(int customerId) {
		
		Iterable<Ticket> list =  ticketRepo.findAll();
		
		List newList = new ArrayList<>();
		
		
		for(Ticket t:list) {
			
			if(t.getCustomer().getCustomerId()==customerId) {
				newList.add(t);
			}
		}
		
		return newList;
			
	}

	@Override
	public double calculateBill(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Ticket> getTicketDetails(int ticketId) {
		
		return ticketRepo.findById(ticketId);
	}

	
}
