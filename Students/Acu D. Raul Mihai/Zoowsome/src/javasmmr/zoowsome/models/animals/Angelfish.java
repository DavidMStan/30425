package javasmmr.zoowsome.models.animals;

public class Angelfish extends Aquatic {

	public Angelfish (String name, int avgSwimDepth){
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	
	public Angelfish(){
		this.setName("Angelfish");
		this.setAvgSwimDepth(160);
	}
}
