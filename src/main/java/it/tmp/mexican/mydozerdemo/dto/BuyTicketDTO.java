package it.tmp.mexican.mydozerdemo.dto;

public class BuyTicketDTO implements GenericDTO{
	
	private String merchantCode;
	private double ticketAmount;

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
