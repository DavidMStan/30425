package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{

	private boolean migrates;
	private int avgFlightAltitude;
	
	public boolean getMigrates(){
		return this.migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude(){
		return this.avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
}
