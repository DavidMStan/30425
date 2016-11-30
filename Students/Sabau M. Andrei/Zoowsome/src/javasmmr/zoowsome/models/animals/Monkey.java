package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

	private static int counter = 0;
	
	public Monkey(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair (percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Monkey(){
		this(31.9f, 95.5f, 2, "Monkey" + counter, 7.1, 0.4);
		++counter;
	} 
}
