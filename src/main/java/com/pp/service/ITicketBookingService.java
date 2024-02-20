package com.pp.service;

import com.pp.request.Passenger;
import com.pp.response.Ticket;

public interface ITicketBookingService {
public Ticket BookTicket(Passenger passenger);
public Ticket getTicket(Integer TicketNumber);
}
