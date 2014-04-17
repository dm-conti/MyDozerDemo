package it.tmp.mexican.mydozerdemo.domain;

import java.io.Serializable;

public class Address implements GenericObject, Serializable{
	private static final long serialVersionUID = -7229041162065332503L;

	private String road; 
	private String city;
	
	public Address(){
	}
	
	/**
	 * @param road
	 * @param city
	 * @return the address 
	 * **/
	public Address(String _road, String _city){
		road = _road;
		city = _city;
	}
	
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
