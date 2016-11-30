package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Aquatics.ANGELFISH.equals(type) ){
			return new Angelfish();
		}
		else if( Constants.Animals.Aquatics.ANGELSHARK.equals(type) ){
			return new Angelshark();
		}
		else if( Constants.Animals.Aquatics.ANGLERFISH.equals(type) ){
			return new Anglerfish();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}
