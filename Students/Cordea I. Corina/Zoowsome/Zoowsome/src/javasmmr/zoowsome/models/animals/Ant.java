package javasmmr.zoowsome.models.animals;

public class Ant extends Insect {
	public Ant(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public Ant (){
		this.setName("Ant");
		this.setNrOfLegs(6);
		this.setCanFly(false);
		this.setIsDangerous(false);
	}
}
