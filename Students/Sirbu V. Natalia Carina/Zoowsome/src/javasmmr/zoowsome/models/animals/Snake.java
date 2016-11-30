package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	
	public Snake (String name) {
		this.laysEggs = true;
		this.setName(name);
		this.setNrOfLegs(0);
	}

}
