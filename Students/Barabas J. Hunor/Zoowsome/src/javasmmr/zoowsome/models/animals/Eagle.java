package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(String name, int legs, boolean migrate, int altitude){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgFlightAltitude(altitude);
		this.setMigrates(migrate);
		setCost(1.1);
	}
	
	public Eagle(){
		this.setName("Eagle");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(140);
		this.setMigrates(false);
		setCost(1.1);
	}
}
