package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dove;
import javasmmr.zoowsome.models.animals.Raven;
import javasmmr.zoowsome.models.animals.Swan;

public class BirdFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) {
		if (Constants.Animals.Birds.Dove.equals(type)) {
			return new Dove(); // leave empty constructor, for now!
		
		} else if (Constants.Animals.Birds.Raven.equals(type)) {
			return new Raven();
		
		} else if (Constants.Animals.Birds.Swan.equals(type)){
			return new Swan();
		
		}else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
