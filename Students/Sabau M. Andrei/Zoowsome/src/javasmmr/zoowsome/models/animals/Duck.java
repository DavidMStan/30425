package javasmmr.zoowsome.models.animals;

public class Duck extends Bird{

	private static int counter = 0;
	
	public Duck(boolean migrates, int avgFlightAltitude, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Duck(){
		this(false, 20, 2, "Duck" + counter, 0.2, 0);
		++counter;
	}
}
