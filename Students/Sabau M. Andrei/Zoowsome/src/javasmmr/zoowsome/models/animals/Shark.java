package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Shark extends Aquatic{

	private static int counter = 0;
	
	public Shark(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String  name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		super.typeOfWater = typeOfWater;
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Shark(){
		this(34, waterType.saltWater, 0, "Shark" + counter, 3.45, 0.92);
		++counter;
	}
	
	public double getPredisposition(){
		boolean isTimeBetween11And6 = timeBetween11pmAnd6am();
		
		if(isTimeBetween11And6) 
			return 0.45;

		return 0;
	}
}
