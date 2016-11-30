package javasmmr.zoowsome.models.animals;

public class MountainLion  extends Mammal{
	public MountainLion(String Name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
		this.setName(Name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
		this.setNrOfLegs(nrOfLegs);	
	}
	public MountainLion(){
		this.setName("MountainLion");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float)36.19);
		this.setPercBodyHair((float)79.61);
	}

}
