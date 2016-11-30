package javasmmr.zoowsome.models.animals;

public class Centipede extends Insect {
	
	public Centipede(String name, boolean canFly,boolean isDangerous){
		
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	
	public Centipede(){
		this.setName("Centipede");
		this.setCanFly(false);
		this.setIsDangerous(true);
	}

}
