package javasmmr.zoowsome.models.animals;

public class Mongoose extends Mammal{
	
	public Mongoose(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}

	public Mongoose(){	
		
		this.setName("Mongoose");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 39.7);
		this.setPercBodyHair((float) 91.3);
}
}
