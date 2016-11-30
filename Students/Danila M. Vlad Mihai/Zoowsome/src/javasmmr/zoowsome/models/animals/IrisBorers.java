package javasmmr.zoowsome.models.animals;

public class IrisBorers extends Insect {
	public IrisBorers(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);	
	}
	public IrisBorers(){
		this.setName("IrisBorers");
		this.setNrOfLegs(8);
		this.setCanFly(true);
		this.setIsDangerous(false);
	}

}
