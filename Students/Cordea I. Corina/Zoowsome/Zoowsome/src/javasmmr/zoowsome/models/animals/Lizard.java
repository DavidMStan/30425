package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	public Lizard(String Name, int nrOfLegs, boolean laysEggs ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public Lizard(){
		this.setName("Lizard");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
	}
}
