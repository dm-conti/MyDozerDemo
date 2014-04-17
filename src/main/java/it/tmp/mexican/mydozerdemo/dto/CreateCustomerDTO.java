package it.tmp.mexican.mydozerdemo.dto;


public class CreateCustomerDTO implements GenericDTO{
	
	private String customerName;
	private String customerSurname;
	private String customerCity;
	private String customerAddress;

	public CreateCustomerDTO(String _customerName, String _customerSurname, String _customerCity, String _customerAddress){
		customerName = _customerName;
		customerSurname = _customerSurname;
		customerCity = _customerCity;
		customerAddress = _customerAddress;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}	
}