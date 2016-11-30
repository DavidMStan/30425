package javasmmr.zoowsome.models.animals;

public class Hippopotamus extends Aquatic {
	
	public Hippopotamus (String name) {
		
		this.avgSwimDepth = 20;
		this.waterType = WaterType.FRESHWATER;
		this.setName(name);
		this.setNrOfLegs(4);
		
	}

}
