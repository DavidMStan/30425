package javasmmr.zoowsome.models.animals;

public class ReticulateLizard extends Reptile{
	public ReticulateLizard( String name, int nrOfLegs, boolean laysEggs ){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public ReticulateLizard(){
		this.setName("ReticulateLizzard");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
		
	}

}
