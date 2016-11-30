package javasmmr.zoowsome.models.animals;

public class Blackbird extends Bird {
		public Blackbird(String Name, int nrOfLegs, boolean migrates, int avgFlightAltitude ){
			this.setName(Name);
			this.setMigrates(migrates);
			this.setAvgFlightAltitude(avgFlightAltitude);
			this.setNrOfLegs(nrOfLegs);	
		}
		public Blackbird(){
			this.setName("BlackBird");
			this.setNrOfLegs(2);
			this.setMigrates(false);
			this.setAvgFlightAltitude(43);
		}
}
