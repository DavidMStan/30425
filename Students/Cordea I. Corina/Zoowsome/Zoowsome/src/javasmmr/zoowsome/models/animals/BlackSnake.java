package javasmmr.zoowsome.models.animals;

public class BlackSnake extends Reptile{
	public BlackSnake(String Name, int nrOfLegs, boolean laysEggs ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public BlackSnake(){
		this.setName("BlackSnake");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
	}
}
