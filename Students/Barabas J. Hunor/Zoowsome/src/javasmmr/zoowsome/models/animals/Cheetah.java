package javasmmr.zoowsome.models.animals;

public class Cheetah extends Mammal {

	public Cheetah(String name, int legs, float temp, float hair){
		this.setNrOfLegs(legs);
		this.setName(name);
		this.setNormalBodyTemp(temp);
		this.setPercBodyHair(hair);
		setCost(1.3);
	}
	
	public Cheetah(){
		this.setName("Cheetah");
		this.setNrOfLegs(4);
		this.setNormalBodyTemp(36);
		this.setPercBodyHair(70);
		setCost(1.3);
	}
}
