package javasmmr.zoowsome.models.animals;

public class Piranha extends Aquatic {

	public Piranha(String name, int legs, waterTypeE type, int depth){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
		setCost(1.9);
		
	}
	
	public Piranha(){
		this.setName("Anglerfish");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(2);
		this.setWaterType(waterTypeE.FRESHWATER);
		setCost(1.9);
	}
}
