package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	public enum Enum{
		SALTWATER, FRESHWATER
	}
	private Enum waterType;
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	public Enum getWaterType(){
		return waterType;
	}
	public void setWaterType(Enum waterType ){
		this.waterType = waterType;
	}
}
