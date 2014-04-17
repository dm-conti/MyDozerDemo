package it.tmp.mexican.mydozerdemo.dto;

public class OrderBuyTicketDTO implements GenericDTO{
	
	private long customerId;
	private String ticketType;
	private String merchantCode;
	private double ticketAmount;
	
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
	
	public String getMerchantCode() {
		return merchantCode;
	}
	
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public double getTicketAmount() {
		return ticketAmount;
	}
	
	public void setTicketAmount(double ticketAmount) {
		this.ticketAmount = ticketAmount;
	}
}