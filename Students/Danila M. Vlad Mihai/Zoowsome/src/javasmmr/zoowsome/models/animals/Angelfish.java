package javasmmr.zoowsome.models.animals;

public class Angelfish extends Aquatic {
	public Angelfish(String Name, int nrOfLegs, int avgSwimDepth, Enum waterType ){
		this.setName(Name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Angelfish(){
		this.setName("Angelfish");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(67);
		this.setWaterType(Enum.SALTWATER);
	}
}
