package javasmmr.zoowsome.models.animals;

public class Iguana extends Reptile {
	
	public Iguana(String name, boolean laysEggs){
		
		this.setName(name);
		this.setLaysEggs(laysEggs);
	}
	
	public Iguana(){
		
		this.setName("Iguana");
		this.setLaysEggs(true);
	}
	

}
