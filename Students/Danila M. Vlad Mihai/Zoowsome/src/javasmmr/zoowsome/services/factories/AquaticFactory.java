package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Aquatics.ANGEL_FISH.equals(type) ){
			return new Angelfish();
		}
		else if( Constants.Animals.Aquatics.ANGEL_SHARK.equals(type) ){
			return new Angelshark();
		}
		else if( Constants.Animals.Aquatics.ANGLER_FISH.equals(type) ){
			return new Anglerfish();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
