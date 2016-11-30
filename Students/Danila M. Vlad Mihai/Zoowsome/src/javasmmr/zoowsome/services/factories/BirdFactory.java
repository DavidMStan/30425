package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Birds.BLACKBIRD.equals(type) ){
			return new Blackbird(); //leave empty constructor, for now
		}
		else if( Constants.Animals.Birds.BLUEBIRD.equals(type) ){
			return new Bluebird();
		}
		else if( Constants.Animals.Birds.BROOD.equals(type) ){
			return new Brood();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
