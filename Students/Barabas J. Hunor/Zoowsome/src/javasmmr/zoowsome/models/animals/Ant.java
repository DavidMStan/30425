package javasmmr.zoowsome.models.animals;

public class Ant extends Insect {
	
	public Ant(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
		setCost(0.5);
	}
	
	public Ant(){
		this.setName("Ant");
		this.setNrOfLegs(6);
		this.setIsDangerous(false);
		this.setCanFly(false);
		setCost(0.5);

	}

}
