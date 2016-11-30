package javasmmr.zoowsome.models.animals;

public class RussianViper extends Reptile {
	public RussianViper( String Name, int nrOfLegs, boolean laysEggs ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public RussianViper(){
		this.setName("RussianViper");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
		
	}
}
