package javasmmr.zoowsome.models.animals;

public class RidgeheadSnake extends Reptile{
	public RidgeheadSnake( String name, int nrOfLegs, boolean laysEggs ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public RidgeheadSnake(){
		this.setName("RidgeheadSnake");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
		
	}

}
