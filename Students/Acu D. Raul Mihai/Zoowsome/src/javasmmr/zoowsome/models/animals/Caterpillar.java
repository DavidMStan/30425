package javasmmr.zoowsome.models.animals;

public class Caterpillar extends Insect {
	
	public Caterpillar(String name, boolean canFly,boolean isDangerous){
		
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	
	public Caterpillar(){
		this.setName("Caterpillar");
		this.setCanFly(false);
		this.setIsDangerous(false);
	}

}
