package javasmmr.zoowsome.models.animals;

public class Dove extends Bird {
	
	public Dove (String name) {
		this.setName(name);
		this.setNrOfLegs(2);
		this.migrates = false;
		this.avgFlightAltitude = 30;
	}

}
