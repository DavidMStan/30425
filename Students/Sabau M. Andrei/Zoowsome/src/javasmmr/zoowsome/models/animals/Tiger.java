package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal{

	private static int counter = 0;
	
	public Tiger(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair (percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Tiger(){
		this(34.1f, 96.2f, 4, "Tiger" + counter, 4.5, 0.9);
		++counter;
	}
	
	public double getPredisposition(){
		boolean isTimeBetween11And6 = timeBetween11pmAnd6am();
		
		if(isTimeBetween11And6) 
			return 0.5;

		return 0;
	}
}
