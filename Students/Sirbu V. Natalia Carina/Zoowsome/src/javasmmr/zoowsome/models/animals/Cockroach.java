package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	
	public Cockroach (String name) {
		this.setName(name);
		this.setNrOfLegs(6);
		this.canFly = false;
		this.isDangerous = false;
	}

}
