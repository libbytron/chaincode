package com.utilities;

public abstract class Product {
	double valuePerGallon;
	
	public Product(){
		valuePerGallon = 0;
	}
	
	public void updateValuePerGallon(){};
	
	public double getValuePerGallon(){ return this.valuePerGallon; };
	public void setValuePerGallon(double valuePerGallon){ this.valuePerGallon = valuePerGallon; }; 
}
