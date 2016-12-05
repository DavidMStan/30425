package javasmmr.zoowsome.models.animals;

public class Komodo extends Reptile {

	public Komodo(String name, int legs, boolean layEggs){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setLayEggs(layEggs);
		setCost(2.3);
	}
	
	public Komodo(){
		this.setName("Komodo");
		this.setNrOfLegs(4);
		this.setLayEggs(true);
		setCost(2.5);
	}
}
