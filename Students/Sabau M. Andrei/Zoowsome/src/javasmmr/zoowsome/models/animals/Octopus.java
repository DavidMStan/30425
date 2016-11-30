package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Octopus extends Aquatic{

	private static int counter = 0;
	
	public Octopus(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		super.typeOfWater = typeOfWater;
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Octopus(){
		this(43, waterType.saltWater, 0, "Octopus" + counter, 2.19, 0.4);
		++counter;
	}
}
