package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {

	private static int counter = 0;
	
	public Cockroach(boolean canFly, boolean isDangerous, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Cockroach(){
		this(false, false, 6, "Cockroach" + counter, 0.1, 0.1);
		++counter;
	}
}
