package com.utilities;

import java.util.ArrayList;

public class PredictionMechanism {
	public double createCollectionTotalsPrediction(ArrayList<GasCollection> gasCollections){
		
		double totalGasCollected = 0;
		
		for(GasCollection collection : gasCollections){
			totalGasCollected += collection.actualTotal;
		}
		
		return totalGasCollected/gasCollections.size();
	}
}
