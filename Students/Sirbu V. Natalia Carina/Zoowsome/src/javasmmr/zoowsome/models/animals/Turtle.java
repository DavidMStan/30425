package javasmmr.zoowsome.models.animals;

public class Turtle extends Reptile {
	
	public Turtle (String name) {
		this.laysEggs = true;
		this.setName(name);
		this.setNrOfLegs(4);
	}

}
