package javasmmr.zoowsome.models.animals;
public class Insect extends Animal {
	
	private boolean canFly;
	private boolean isDangerous;
	
	public void setCanFly ( boolean yesCFly) {
		this.canFly = yesCFly;
	}
	
	public boolean getCanFly () {
		return this.canFly;
	}
	
	public void setIsDangerous (boolean yesIDangerous) {
		this.isDangerous = yesIDangerous;
	}
	public boolean getIsDangerous () {
		return this.isDangerous;
	}	
}
