package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	private int nrOfLegs;
	private String name;
	
	public int getNoOfLegs() {
		return nrOfLegs;		
	}
	
	public void setNrOfLegs(int fNrOfLegs) {
		this.nrOfLegs = fNrOfLegs;
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String fName) {
		name = fName;
		
	}
	

}
