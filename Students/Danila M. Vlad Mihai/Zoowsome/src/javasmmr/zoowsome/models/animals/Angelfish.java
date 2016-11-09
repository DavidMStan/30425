package javasmmr.zoowsome.models.animals;

public class Angelfish extends Aquatic {
	public Angelfish(String name, int nrOfLegs, int avgSwimDepth, Enum waterType ){
		this.setName(name);
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
