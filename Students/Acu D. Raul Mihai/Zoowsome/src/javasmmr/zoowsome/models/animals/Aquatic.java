package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	
	public int getAvgSwimDepth(){
		return avgSwimDepth;
	}
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth=avgSwimDepth;
	}

}