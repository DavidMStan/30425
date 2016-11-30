package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {

	public Cow(String name) {
		this.setName(name);
		this.normalBodyTemp = 38;
		this.setNrOfLegs(4);
		this.percBodyHair = 80;
	}
}
