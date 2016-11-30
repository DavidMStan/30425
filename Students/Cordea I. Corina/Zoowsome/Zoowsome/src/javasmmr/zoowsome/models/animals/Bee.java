package javasmmr.zoowsome.models.animals;

public class Bee extends Insect{
	public Bee(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public Bee (){
		this.setName("Bee");
		this.setNrOfLegs(4);
		this.setCanFly(true);
		this.setIsDangerous(true);
	}
}
