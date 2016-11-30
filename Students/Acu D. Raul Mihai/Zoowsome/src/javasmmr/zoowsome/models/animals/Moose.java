package javasmmr.zoowsome.models.animals;

public class Moose extends Mammal{
	
	public Moose(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}

	public Moose(){	
		
		this.setName("Moose");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 38.5);
		this.setPercBodyHair((float) 85.0);
}
}
