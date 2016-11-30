package javasmmr.zoowsome.models.animals;

public class Bluebird extends Bird {
	public Bluebird(String Name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
		this.setName(Name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Bluebird(){
		this.setName("Bluebird");
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setAvgFlightAltitude(39);
	}

}
