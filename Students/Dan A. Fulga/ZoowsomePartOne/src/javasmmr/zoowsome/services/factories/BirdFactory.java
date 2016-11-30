package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.*;
public class BirdFactory extends SpeciesFactory {
	
	public Animal getAnimal (String type ) {
		if(Constants.Animals.Bird.Mockingbird.equals(type)) {
			return new MockingBird();
		}
		else if(Constants.Animals.Bird.Penguin.equals(type)) {
			return new Penguin();
		}
		else if(Constants.Animals.Bird.Canary.equals(type)) {
			return new Canary();
		}
		else {
			throw new RuntimeException("Invalid Animal Exception!");
		}
	}
}

