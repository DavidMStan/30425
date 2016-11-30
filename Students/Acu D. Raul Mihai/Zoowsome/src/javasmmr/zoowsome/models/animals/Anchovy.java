package javasmmr.zoowsome.models.animals;

public class Anchovy extends Aquatic {

	public Anchovy (String name, int avgSwimDepth){
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	
	public Anchovy(){
		this.setName("Anchovy");
		this.setAvgSwimDepth(900);
	}
}
