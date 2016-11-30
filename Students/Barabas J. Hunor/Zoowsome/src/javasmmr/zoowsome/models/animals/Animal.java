package javasmmr.zoowsome.models.animals;

public abstract class Animal {

	private int nrOfLegs;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(int legs){
		this.nrOfLegs = legs;
	}
}
