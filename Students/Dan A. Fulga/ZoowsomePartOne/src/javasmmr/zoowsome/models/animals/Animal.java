package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	int nrOfLegs;
	String name;
	
	public int nrOfLegs() {
		
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs) {
		
		this.nrOfLegs = nrOfLegs;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
}