package javasmmr.zoowsome.models.animals;
public abstract class Aquatic extends Animal {

	public enum waterType {
		saltWater,
		freshWater
	};
  
	private waterType waterType;
	private int avgSwimDepth;
  
	public Aquatic() {
  
	  super();
	}
  
	public waterType getWaterType() {
  
	  return this.waterType;
	}
  
	public int getAvgSwimDepth() {
  
	  return this.avgSwimDepth;
  	}
  
	public void setWaterType(waterType waterType) {
	
	  this.waterType = waterType;
	}
  
	public void setAvgSwimDepth(int swimDepth) {
  
	  this.avgSwimDepth = swimDepth;
  	}
}
		

