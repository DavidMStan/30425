package javasmmr.zoowsome.models.animals;

public class Brood extends Bird{
	public Brood(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Brood(){
		this.setName("Brood");
		this.setNrOfLegs(2);
		this.setMigrates(false);
		this.setAvgFlightAltitude(51);
	}

}
