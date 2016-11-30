package javasmmr.zoowsome.models.animals;

public class MountainGoat extends Mammal {
	public MountainGoat(String Name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
		this.setName(Name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
		this.setNrOfLegs(nrOfLegs);	
	}
	public MountainGoat(){
		this.setName("MountainGoat");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp((float)39.9);
		this.setPercBodyHair((float)89.91);
	}

}
