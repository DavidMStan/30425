package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {

	public int avgSwimDepth;
	
	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}
	public enum waterTypeE{
		SALTWATER, FRESHWATER
	};
	
	public waterTypeE waterType;
	
	public waterTypeE getWaterType() {
		return waterType;
	}
	public void setWaterType(waterTypeE waterType) {
		this.waterType = waterType;
	}
	

}
