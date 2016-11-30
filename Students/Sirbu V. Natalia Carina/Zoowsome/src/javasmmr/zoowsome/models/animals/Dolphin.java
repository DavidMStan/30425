package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	
	public Dolphin (String name) {
		this.avgSwimDepth = 200;
		this.waterType = WaterType.SALTWATER;
		this.setName(name);
		this.setNrOfLegs(0);
	}

}
