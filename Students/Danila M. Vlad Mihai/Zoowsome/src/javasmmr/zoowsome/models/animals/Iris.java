package javasmmr.zoowsome.models.animals;

public class Iris extends Insect {
	public Iris(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Iris(){
		this.setName("Iris");
		this.setNrOfLegs(6);
		this.setCanFly(false);
		this.setIsDangerous(false);
	}

}
