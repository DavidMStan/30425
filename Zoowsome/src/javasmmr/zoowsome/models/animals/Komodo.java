package javasmmr.zoowsome.models.animals;

public class Komodo extends Reptile {

	public Komodo(String name, int legs, boolean layEggs){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setLayEggs(layEggs);
		
	}
	
	public Komodo(){
		this.setName("Komodo");
		this.setNrOfLegs(4);
		this.setLayEggs(true);

	}
}
