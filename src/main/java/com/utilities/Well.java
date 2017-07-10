package com.utilities;

public class Well {
	int id;
	Address address;
	double balancingUnits;
	Product productType;
	Company owner;
	
	public Well(int id, Address address, double balancingUnits, Product productType, Company owner){
		this.id = id;
		this.address = address;
		this.balancingUnits = balancingUnits;
		this.productType = productType;
		this.owner = owner;
	}
	
	public int getId(){ return this.id; };
	public void setId(int id){ this.id = id; };
	
	public Address getAddress(){ return this.address; };
	public void setAddress(Address address){ this.address = address; };
	
	public double getBalancingUnits(){ return this.balancingUnits; };
	public void setBalancingUnits(double balancingUnits){ this.balancingUnits = balancingUnits; };
	
	public Product getProductType(){ return this.productType; };
	public void setProductType(Product productType){ this.productType = productType; };
	
	public Company getOwner(){ return this.owner; };
	public void setOwner(Company owner){ this.owner = owner; };
}
