package javasmmr.zoowsome.models.animals;
 
public class PolarBear extends Mammal {
	
	public PolarBear(String name, int legs, float temp, float hair){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(hair);
		setCost(4);
	}
	
	public PolarBear(){
		this.setName("Polar Bear");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(85);
		setCost(4);
	}
}
