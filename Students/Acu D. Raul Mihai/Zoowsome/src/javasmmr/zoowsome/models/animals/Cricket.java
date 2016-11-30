package javasmmr.zoowsome.models.animals;

public class Cricket extends Insect {
	
	public Cricket(String name, boolean canFly,boolean isDangerous){
		
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
	}
	
	public Cricket(){
		this.setName("Cricket");
		this.setCanFly(true);
		this.setIsDangerous(false);
	}

}
