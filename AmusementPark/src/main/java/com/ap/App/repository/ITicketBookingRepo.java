package com.ap.App.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ap.App.Entity.Ticket;

@Repository
public interface ITicketBookingRepo extends CrudRepository<Ticket, Integer>{

}
