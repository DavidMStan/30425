package javasmmr.zoowsome.models.animals;

public class AnglerFish extends Aquatic {
	
	public AnglerFish(String name, int legs, waterTypeE type, int depth){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
	
		
	}
	
	public AnglerFish(){
		this.setName("Anglerfish");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(1000);
		this.setWaterType(waterTypeE.SALTWATER);
	}

}
