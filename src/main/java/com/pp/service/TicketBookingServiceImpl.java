package com.pp.service;




import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pp.request.Passenger;
import com.pp.response.Ticket;
@Service
public class TicketBookingServiceImpl implements ITicketBookingService {

	private static final String URL = "http://localhost:8787/TicketBookingApp/api/getTicketNumber";
	private static final String GET_URL = "http://localhost:8787/TicketBookingApp/api/getPassengerTicket/{ticketNumber}";

	@Override
	public Ticket BookTicket(Passenger passenger) {
	   RestTemplate restTemplate=new RestTemplate();
	   System.out.println("data from passenger given to RestApi with "+restTemplate.getClass().getName());
	 ResponseEntity<Ticket> response = restTemplate.postForEntity(URL, passenger,Ticket.class );
	   
		return response.getBody();
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		RestTemplate restTemplate=new RestTemplate();
		System.out.println("control in ");
		ResponseEntity<Ticket> responseTicket = restTemplate.getForEntity(GET_URL, Ticket.class, ticketNumber);
		Ticket ticket = responseTicket.getBody();
		System.out.println(ticket);
		return ticket;
	}

}
