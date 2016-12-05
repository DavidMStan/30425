package javasmmr.zoowsome.models.animals;

public class Salmon extends Aquatic {
	
	public Salmon(String name, int legs, waterTypeE type, int depth){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgSwimDepth(depth);
		this.setWaterType(type);
		setCost(0.3);
		
	}
	
	public Salmon(){
		this.setName("Salmon");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(12);
		this.setWaterType(waterTypeE.SALTWATER); //and FRESHWATER too in times of mating
		setCost(0.3);
	}

}
