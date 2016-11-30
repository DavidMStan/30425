package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile{

	private static int counter = 0;
	
	public Snake(boolean laysEggs, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Snake(){
		this(true, 0, "Snake" + counter, 6.1, 0.78);
		++counter;
	}
	
	public double getPredisposition(){
		boolean isTimeBetween11And6 = timeBetween11pmAnd6am();
		
		if(isTimeBetween11And6) 
			return 0.25;

		return 0;
	}
}
