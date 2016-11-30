package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	private static int counter = 0;
	
	public Cow(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair (percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Cow(){
		this(34.1f, 87.9f, 4, "Cow" + counter, 0.77, 0);
		++counter;
	}
} 
