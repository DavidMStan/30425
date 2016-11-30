package javasmmr.zoowsome.models.animals;

public class Crap extends Aquatic {
	public Crap(String Name, int nrOfLegs, Enum waterType, int avgSwimDepth ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setWaterType(waterType);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	public Crap(){
		this.setName("Crap");
		this.setNrOfLegs(0);
		this.setWaterType(Enum.FRESHWATER);
		this.setAvgSwimDepth(10);
	}	
}
