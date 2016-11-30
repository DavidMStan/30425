package javasmmr.zoowsome.models.animals;

public class Brant extends Bird {
	
	public Brant(String name, boolean migrates, int avgFlightAltitude){
	
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
	
	public Brant(){
		this.setName("Brant");
		this.setAvgFlightAltitude(1500);
		this.setMigrates(true);
	}

	

}
