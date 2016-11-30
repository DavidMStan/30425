package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(String Name, int nrOfLegs, Enum waterType, int avgSwimDepth ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Shark(){
		this.setName("Skark");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.SALTWATER);
		this.setAvgSwimDepth(100);
	}	
}
