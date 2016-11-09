package javasmmr.zoowsome.models.animals;

public class Anglerfish extends Aquatic {
		public Anglerfish(String name, int nrOfLegs, int avgSwimDepth, Enum waterType ){
			this.setName(name);
			this.setAvgSwimDepth(avgSwimDepth);
			this.setWaterType(waterType);
			this.setNrOfLegs(nrOfLegs);	
		}
		public Anglerfish(){
			this.setName("Anglerfish");
			this.setNrOfLegs(0);
			this.setAvgSwimDepth(112);
			this.setWaterType(Enum.SALTWATER);
		}
}
