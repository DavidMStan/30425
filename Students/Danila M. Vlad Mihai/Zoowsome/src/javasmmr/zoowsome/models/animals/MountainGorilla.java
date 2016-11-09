package javasmmr.zoowsome.models.animals;

public class MountainGorilla extends Mammal{
	public MountainGorilla(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
		this.setNrOfLegs(nrOfLegs);	
	}
	public MountainGorilla(){
		this.setName("MountainGorilla");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float)37.12);
		this.setPercBodyHair((float)94.21);
	}

}
