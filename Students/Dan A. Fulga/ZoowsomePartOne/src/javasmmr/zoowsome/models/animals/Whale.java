package javasmmr.zoowsome.models.animals;

public  class Whale extends Aquatic {
	public Whale () {
		this.setName("Whale");
		this.setAvgSwimDepth(1500);
		this.setNrOfLegs(4);
		this.setWaterType(waterType.saltWater);

	}
}
