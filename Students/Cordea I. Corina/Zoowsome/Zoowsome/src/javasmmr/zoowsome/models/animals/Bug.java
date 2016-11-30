package javasmmr.zoowsome.models.animals;

public class Bug extends Insect {
	public Bug(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	public Bug(){
		this.setName("Bug");
		this.setNrOfLegs(8);
		this.setCanFly(false);
		this.setIsDangerous(false);
	}
}
