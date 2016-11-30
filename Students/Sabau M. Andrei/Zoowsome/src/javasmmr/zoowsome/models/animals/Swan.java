package javasmmr.zoowsome.models.animals;

public class Swan extends Bird{

	private static int counter = 0;
	
	public Swan(boolean migrates, int avgFlightAltitude, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Swan(){
		this(true, 30, 2, "Swan" + counter, 3, 0.01);
		++counter;
	}
}
