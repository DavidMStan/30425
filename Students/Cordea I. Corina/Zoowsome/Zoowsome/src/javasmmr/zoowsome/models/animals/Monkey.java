package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{
		public Monkey(String Name, int nrOfLegs, float normalBodyTemp, float percBodyHair ){
			this.setName(Name);
			this.setNrOfLegs(nrOfLegs);
			this.setNormalBodyTemp(normalBodyTemp);
			this.setPercBodyHair(percBodyHair);
		}
		public Monkey(){
			this.setName("Monkey");
			this.setNrOfLegs(4);
			this.setNormalBodyTemp((float)36.7);
			this.setPercBodyHair((float)87.5);
		}	
}
