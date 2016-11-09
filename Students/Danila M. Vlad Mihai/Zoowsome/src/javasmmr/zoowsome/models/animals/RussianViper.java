package javasmmr.zoowsome.models.animals;

public class RussianViper extends Reptile {
	public RussianViper( String name, int nrOfLegs, boolean laysEggs ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public RussianViper(){
		this.setName("RussianViper");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
		
	}
}
