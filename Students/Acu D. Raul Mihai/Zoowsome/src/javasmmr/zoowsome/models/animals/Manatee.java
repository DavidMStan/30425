package javasmmr.zoowsome.models.animals;

public class Manatee extends Mammal{
	
	public Manatee(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
	}

	public Manatee(){	
		
		this.setName("Manatee");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float) 36.4);
		this.setPercBodyHair((float) 0.0);
}
}
