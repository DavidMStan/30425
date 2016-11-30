package javasmmr.zoowsome.models.animals;

public class IrisWeevils extends Insect{
	public IrisWeevils(String Name, int nrOfLegs, boolean canFly, boolean isDangerous ){
		this.setName(Name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);	
	}
	public IrisWeevils(){
		this.setName("IrisWeevils");
		this.setNrOfLegs(4);
		this.setCanFly(true);
		this.setIsDangerous(true);
	}

}
