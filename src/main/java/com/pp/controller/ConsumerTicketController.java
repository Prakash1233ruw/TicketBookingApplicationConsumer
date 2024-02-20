package com.pp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pp.request.Passenger;
import com.pp.response.Ticket;
import com.pp.service.ITicketBookingService;



@Controller
//@RequestMapping("/consumer")
public class ConsumerTicketController {
	@Autowired
	private ITicketBookingService service;
	
     @GetMapping("/form")
	public String getForm(Model model) {
		
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
     @PostMapping("/book-ticket")
 	public String register(@ModelAttribute Passenger passenger, Model model) {
    	 System.out.println("response for ticket");
 	   Ticket ticketResponse = service.BookTicket(passenger);
 		model.addAttribute("ticketNumber","ticket Number is: "+ ticketResponse.getTicketNumber());
 		return "index";
 	}
     
     @GetMapping("/ticket")
 	public String getTicketForm(Model model) {
 		
 		model.addAttribute("ticket", new Ticket());
 		return "ticketForm";
 	}
     
     @GetMapping("/get-ticket")
  	public String getTicketData(@RequestParam Integer ticketNumber,Model model) {
    	 System.out.println("passing");
  		Ticket ticketObject = service.getTicket(ticketNumber);
  		model.addAttribute("ticket",ticketObject);
  		System.out.println("passing");
  		return "ticketForm";
  	}
	
}
