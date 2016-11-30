package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	
	public Butterfly (String name) {
		this.setNrOfLegs(6);
		this.setName(name); 
		this.canFly = true;
		this.isDangerous = false;
	}
	
}
