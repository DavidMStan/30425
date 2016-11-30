package javasmmr.zoowsome.models.animals;

public class Swan extends Bird {
	
	public Swan (String name) {
		this.avgFlightAltitude = 35;
		this.migrates = true;
		this.setName(name);
		this.setNrOfLegs(2);
	}

}
