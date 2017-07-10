package com.utilities;

public class Contract {
	Company company;
	Well well;
	double workingInterest;
	
	public Contract(Company company, Well well, double workingInterest)
	{
		this.company = company;
		this.well = well;
		this.workingInterest = workingInterest;
	}
	
	public Company getCompany(){ return this.company; };
	public void setCompany(Company company){ this.company = company; };
	
	public Well getWell(){ return this.well; };
	public void setWell(Well well){ this.well = well; };
	
	public double getWorkingInterest(){ return this.workingInterest; };
	public void setWorkingInterest(double workingInterest){ this.workingInterest = workingInterest; };
}
