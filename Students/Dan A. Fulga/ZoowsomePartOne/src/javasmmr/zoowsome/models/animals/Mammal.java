package javasmmr.zoowsome.models.animals;
public abstract class Mammal extends Animal {
	
	private float normalBodyTemp;
	private float percBodyHair;
	
	public Mammal() {
		}

	public float getNormalBodyTemp () {
		return this.normalBodyTemp;
	}
	
	public float getPercBodyHair () {
		return this.percBodyHair;
	}
	
	public void setNormalBodyTemp(float bodyTemp) {
		this.normalBodyTemp = bodyTemp;
	}
	
	public void setPercBodyHair ( float bodyHair ) {
		this.percBodyHair = bodyHair;
	}
}
