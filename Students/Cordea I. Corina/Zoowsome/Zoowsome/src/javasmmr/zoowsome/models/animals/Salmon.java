package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic {
	public Salmon(String Name, int nrOfLegs, Enum waterType, int avgSwimDepth ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Salmon(){
		this.setName("Salmon");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.FRESHWATER);
		this.setAvgSwimDepth(15);
	}	
}
