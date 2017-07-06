package com.utilities;

public class Allocation {
	Contract contract;
	GasCollection gasCollection;
	double entitlement;
	double actual;
	double overshortGasQuantity;
	
	double overshortMonetaryValue; // positive or negative difference? 
					  // negative = partner received less than entitled, owner owes money to partner
					  // positive = partner received more than entitles, partner owes money to owner
	
	public Allocation(Contract contract, GasCollection gasCollection, double actual, double overshortGasQuantity){
		this.contract = contract;
		this.gasCollection = gasCollection;
		this.entitlement = contract.getWorkingInterest()*gasCollection.getActualTotal();
		this.actual = actual;
		this.overshortGasQuantity = overshortGasQuantity;
		updateEntitlement();
		updateOvershorts();
	}
	
	public Contract getContract(){ return this.contract; };
	public void setContract(Contract contract){
		this.contract = contract; 
		updateEntitlement();
		updateOvershorts();
	};
	
	public GasCollection getGasCollection(){ return this.gasCollection; };
	public void setGasCollection(GasCollection gasCollection){
		this.gasCollection = gasCollection;
		updateEntitlement();
		updateOvershorts();
	};
	
	public double getEntitlement(){ return this.entitlement; };
	public void setEntitlement(double entitlement){ this.entitlement = entitlement; }; // never used
	
	public double getActual(){ return this.actual; };
	public void setActual(double actual){
		this.actual = actual;
		updateOvershorts();
	};
	
	public double getOvershortGasQuantity(){ return this.overshortGasQuantity; };
	public void setOvershortGasQuantity(double overshortGasQuantity){ this.overshortGasQuantity = overshortGasQuantity; }; // never used
	
	public double getOvershortMonetaryValue(){ return this.overshortMonetaryValue; };
	public void setOvershortMonetaryValue(double overshortMonetaryValue){ this.overshortMonetaryValue = overshortMonetaryValue; }; // never used
	
	public void updateEntitlement(){
		double workingInterest = contract.getWorkingInterest();
		double predictedCollectionTotal = gasCollection.getActualTotal();
		entitlement = workingInterest*predictedCollectionTotal;
	}
	
	public void updateOvershorts(){
		updateEntitlement();
		overshortGasQuantity = actual - entitlement;
		overshortMonetaryValue = overshortGasQuantity*contract.getWell().getProductType().getValuePerGallon();
	}
}
