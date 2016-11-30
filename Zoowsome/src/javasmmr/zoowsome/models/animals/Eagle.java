package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {

	public Eagle(String name, int legs, boolean migrate, int altitude){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setAvgFlightAltitude(altitude);
		this.setMigrates(migrate);
		
	}
	
	public Eagle(){
		this.setName("Eagle");
		this.setNrOfLegs(2);
		this.setAvgFlightAltitude(140);
		this.setMigrates(false);
	}
}
