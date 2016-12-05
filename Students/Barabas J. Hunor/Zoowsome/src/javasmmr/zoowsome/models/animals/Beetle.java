package javasmmr.zoowsome.models.animals;

public class Beetle extends Insect {
	
	public Beetle(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
		this.setNrOfLegs(nrOfLegs);
		this.setName(name);
		this.setIsDangerous(isDangerous);
		this.setCanFly(canFly);
		setCost(0.6);
	}
	
	public Beetle(){
		this.setName("Beetle");
		this.setNrOfLegs(6);
		this.setIsDangerous(false);
		this.setCanFly(true);
		setCost(0.6);
	}
}
