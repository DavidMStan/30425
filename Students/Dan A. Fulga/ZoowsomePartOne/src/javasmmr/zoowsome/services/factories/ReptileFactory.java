package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Aligator;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Snake;
public class ReptileFactory extends SpeciesFactory {
	
	public Animal getAnimal (String type) {
		if(Constants.Animals.Reptile.Snake.equals(type)) {
			return new Snake();
		}
		else if(Constants.Animals.Reptile.Aligator.equals(type)) {
			return new Aligator();
		}
		else if(Constants.Animals.Reptile.Crocodile.equals(type)) {
			return new Crocodile();
		}
		else {
			throw new RuntimeException("Invalid Animal Exception!");
		}
	}
}
