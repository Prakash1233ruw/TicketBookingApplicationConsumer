package com.pp.response;

public class Ticket {
	
private Integer ticketNumber;

private String status;
private Double ticketCost;

private String name;
private String departure;

private String arrival;
private String dateOfJourney;
@Override
public String toString() {
	return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketCost=" + ticketCost + ", name="
			+ name + ", departure=" + departure + ", arrival=" + arrival + ", dateOfJourney=" + dateOfJourney + "]";
}
public Integer getTicketNumber() {
	return ticketNumber;
}

public void setTicketNumber(Integer ticketNumber) {
	this.ticketNumber = ticketNumber;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Double getTicketCost() {
	return ticketCost;
}
public void setTicketCost(Double ticketCost) {
	this.ticketCost = ticketCost;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDeparture() {
	return departure;
}
public void setDeparture(String departure) {
	this.departure = departure;
}
public String getArrival() {
	return arrival;
}
public void setArrival(String arrival) {
	this.arrival = arrival;
}
public String getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(String dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}  
}
