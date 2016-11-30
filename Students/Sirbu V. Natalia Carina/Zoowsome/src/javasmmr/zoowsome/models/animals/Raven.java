package javasmmr.zoowsome.models.animals;

public class Raven extends Bird {

	public Raven(String name) {
		this.avgFlightAltitude = 50;
		this.migrates = false;
		this.setName(name);
		this.setNrOfLegs(2);
	}
}
