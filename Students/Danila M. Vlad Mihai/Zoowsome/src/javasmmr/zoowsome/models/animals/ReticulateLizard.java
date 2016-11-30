package javasmmr.zoowsome.models.animals;

public class ReticulateLizard extends Reptile{
	public ReticulateLizard( String Name, int nrOfLegs, boolean laysEggs ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public ReticulateLizard(){
		this.setName("ReticulateLizzard");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
		
	}

}
