package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	
	public Spider (String name, boolean danger) {
		this.setName(name);
		this.setNrOfLegs(8);
		this.canFly = false;
		this.isDangerous = danger;
	}

}
