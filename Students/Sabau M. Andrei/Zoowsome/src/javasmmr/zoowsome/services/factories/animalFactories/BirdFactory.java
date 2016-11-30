package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.SWAN.equals(type))
		{
			return new Swan();
		}
		else if(Constants.Animals.Birds.EAGLE.equals(type))
		{
			return new Eagle();
		}
		else if(Constants.Animals.Birds.DUCK.equals(type))
		{
			return new Duck();
		}
		else
			throw new Exception("Invalid animal exception");
	}
}
