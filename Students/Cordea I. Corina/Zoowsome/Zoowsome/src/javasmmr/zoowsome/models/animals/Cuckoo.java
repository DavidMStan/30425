package javasmmr.zoowsome.models.animals;

public class Cuckoo extends Bird{
	public Cuckoo(String Name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
		this.setName(Name);
		this.setNrOfLegs(nrOfLegs);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
	}
	public Cuckoo(){
		this.setName("Cuckoo");
		this.setNrOfLegs(2);
		this.setMigrates(true);
		this.setAvgFlightAltitude(1234);
	}		
}
