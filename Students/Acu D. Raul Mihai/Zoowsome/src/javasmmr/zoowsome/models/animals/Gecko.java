package javasmmr.zoowsome.models.animals;

public class Gecko extends Reptile {
	
	public Gecko(String name, boolean laysEggs){
		
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
	
	public Gecko(){
		
		this.setName("Gecko");
		this.setLaysEggs(true);
	}
	

}
