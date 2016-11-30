package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal{

	private float normalBodyTemp;
	private float percBodyHair;
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getNormalBodyTemp(){
		return this.normalBodyTemp;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	
	public float getPercBodyHair(){
		return this.percBodyHair;
	}
}
