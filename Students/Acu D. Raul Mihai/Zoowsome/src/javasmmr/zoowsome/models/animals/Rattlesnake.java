package javasmmr.zoowsome.models.animals;

public class Rattlesnake extends Reptile {
	
	public Rattlesnake(String name, boolean laysEggs){
		
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
	
	public Rattlesnake(){
		
		this.setName("Rattlesnake");
		this.setLaysEggs(true);
	}
	

}
