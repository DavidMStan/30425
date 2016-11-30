package javasmmr.zoowsome.models.animals;

public class Viper extends Reptile {
	public Viper(String Name, int nrOfLegs, boolean laysEggs ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public Viper(){
		this.setName("Viper");
		this.setNrOfLegs(0);
		this.setLaysEggs(true);
	}
}
