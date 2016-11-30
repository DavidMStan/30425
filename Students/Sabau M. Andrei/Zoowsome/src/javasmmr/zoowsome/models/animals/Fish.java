package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Fish extends Aquatic{

	private static int counter = 0;
	
	public Fish(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		super.typeOfWater = typeOfWater;
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Fish(){
		this(5, waterType.freshWater, 0, "Fish" + counter, 0.5, 0);
		++counter;
	}
}
