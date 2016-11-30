package javasmmr.zoowsome.models.animals;

public  class MockingBird extends Bird{
	
	public MockingBird () {
		super();
		this.setAvgFlightAltitude(30);
		this.setName("MockingBird");
		this.setMigrates(true);
		this.setNrOfLegs(2);
	}
	
}
