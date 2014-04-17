package it.tmp.mexican.mydozerdemo.dto;

public class OrderTicketDTO implements GenericDTO{

	private long customerId;
	private String ticketType;

	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
		
}