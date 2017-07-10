package com.utilities;

import java.util.Date;

public class GasCollection {
	Well well;
	double actualTotal;
	double predictedTotal;
	Date date;
	
	public GasCollection(Well well, double actualTotal, double predictedTotal, Date date){
		this.well = well;
		this.actualTotal = actualTotal;
		this.predictedTotal = predictedTotal;
		this.date = date;
	}
	
	public Well getWell(){ return this.well; };
	public void setWell(Well well){ this.well = well; };
	
	public double getActualTotal(){ return this.actualTotal; };
	public void setActualTotal(double actualTotal){ this.actualTotal = actualTotal; };
	
	public double getPredictedTotal(){ return this.predictedTotal; };
	public void setPredictedTotal(double predictedTotal){ this.predictedTotal = predictedTotal; };
	
	public Date getDate(){ return this.date; };
	public void setDate(Date date){ this.date = date; };
}
