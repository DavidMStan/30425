package javasmmr.zoowsome.models.animals;
public abstract class Bird extends Animal {
	
	private boolean migrates;
	private int avgFlightAltitude;
	
	public  Bird () {
			
	}
	
	public void setAvgFlightAltitude (int flightAltitude) {
		this.avgFlightAltitude = flightAltitude;
	}
	
	public int getAvgFlightAltitude () {
		return this.avgFlightAltitude;
	}
	
	public void setMigrates ( boolean yesMigrates) {
		this.migrates = yesMigrates;
	}
	
	public boolean getMigrates() {
		return this.migrates;
	}
}
