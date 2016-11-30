package javasmmr.zoowsome.models.animals;

public class Abalone extends Aquatic {

	public Abalone (String name, int avgSwimDepth){
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
	}
	
	public Abalone(){
		this.setName("Abalone");
		this.setAvgSwimDepth(33);
	}
}
