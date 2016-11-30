package javasmmr.zoowsome.models.animals;

public class Bushtit extends Bird {
	
	public Bushtit(String name, boolean migrates, int avgFlightAltitude){
	
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
	
	public Bushtit(){
		this.setName("Bushtit");
		this.setAvgFlightAltitude(2400);
		this.setMigrates(false);
	}

	

}
