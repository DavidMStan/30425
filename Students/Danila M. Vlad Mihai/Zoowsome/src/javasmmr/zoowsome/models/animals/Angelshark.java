package javasmmr.zoowsome.models.animals;

public class Angelshark extends Aquatic {
	public Angelshark(String Name, int nrOfLegs, int avgSwimDepth, Enum waterType ){
		this.setName(Name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Angelshark(){
		this.setName("Angelshark");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(77);
		this.setWaterType(Enum.SALTWATER);
	}
}
