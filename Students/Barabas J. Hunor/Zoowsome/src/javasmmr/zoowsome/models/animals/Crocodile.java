package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	
	public Crocodile(String name, int legs, boolean layEggs){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setLayEggs(layEggs);
		setCost(1.4);
	}
	
	public Crocodile(){
		this.setName("Crocodile");
		this.setNrOfLegs(4);
		this.setLayEggs(true);
		setCost(1.4);
	}
}
