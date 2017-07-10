package com.utilities;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Address(String street, String city, String state, int zip, String country){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	
	public String getStreet(){ return this.street; };
	public void setStreet(String street){ this.street = street; };
	
	public String getCity(){ return this.city; };
	public void setCity(String city){ this.city = city; };
	
	public String getState(){ return this.state; };
	public void setState(String state){ this.state = state; };
	
	public int getZip(){ return this.zip; };
	public void setZip(int zip){ this.zip = zip; };
	
	public String getCountry(){ return this.country; };
	public void setCountry(String country){ this.country = country; };
}
