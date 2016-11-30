package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(String name) {
		this.avgSwimDepth = 300;
		this.waterType = WaterType.SALTWATER;
		this.setName(name);
		this.setNrOfLegs(0);
	}

}
