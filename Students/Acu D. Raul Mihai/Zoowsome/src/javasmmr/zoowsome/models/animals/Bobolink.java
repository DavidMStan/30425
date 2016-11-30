package javasmmr.zoowsome.models.animals;

public class Bobolink extends Bird {
	
	public Bobolink(String name, boolean migrates, int avgFlightAltitude){
	
		this.setName(name);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setMigrates(migrates);
	}
	
	public Bobolink(){
		this.setName("Bobolink");
		this.setAvgFlightAltitude(3000);
		this.setMigrates(true);
	}

	

}
