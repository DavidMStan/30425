package javasmmr.zoowsome.models.animals;
public abstract class Reptile extends Animal {

	private boolean layEggs;
	
	public Reptile() {
	}

	public void setLayEggs ( boolean yes ) {
		this.layEggs = yes;
	}
	public boolean getLayEggs () {
		return this.layEggs;
		
	}
}
