package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public abstract class Aquatic extends Animal {

	private int avgSwimDepth;
	public enum waterType {saltWater, freshWater};
	waterType typeOfWater;
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAvgSwimDepth(){
		return this.avgSwimDepth;
	}
	
}
