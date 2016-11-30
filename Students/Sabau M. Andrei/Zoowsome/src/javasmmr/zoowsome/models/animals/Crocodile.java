package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {

	private static int counter = 0;
	
	public Crocodile(boolean laysEggs, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Crocodile(){
		this(true, 4, "Crocodile" + counter, 4.45, 0.85);
		++counter;
	}
	
	public double getPredisposition(){
		boolean isTimeBetween11And6 = timeBetween11pmAnd6am();
		
		if(isTimeBetween11And6) 
			return 0.3;

		return 0;
	}
}
