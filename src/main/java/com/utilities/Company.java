package com.utilities;

public class Company {
	
	private int id;
	private String name;
	private String abbreviation;
	private Contact contact;
	private Address address;
	
	public Company(int id, String name, String abbreviation, Contact contact, Address address){
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.contact = contact;
		this.address = address;
	}
	
	public int getId(){ return this.id; };
	public void setId(int id){ this.id = id; };
	
	public String getName(){ return this.name; };
	public void setName(String name){ this.name = name; };
	
	public String getAbbreviation(){ return this.abbreviation; };
	public void setAbbreviation(String abbreviation){ this.abbreviation = abbreviation; };
	
	public Contact getContact(){ return this.contact; };
	public void setContact(Contact contact){ this.contact = contact; };
	
	public Address getAddress(){ return this.address; };
	public void setAddress(Address address){ this.address = address; };

}
