package javasmmr.zoowsome.services.factories.animals;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Constants;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptile.Lizard.equals(type)) {
			return new Lizard(); 
		} 
		else if (Constants.Animals.Reptile.Snake.equals(type)) {
			return new Snake();
		}
		else if (Constants.Animals.Reptile.Crocodile.equals(type)){
			return new Crocodile();
		} 
		else {
		throw new Exception("Invalid animal exception!");
		}
	}

}
