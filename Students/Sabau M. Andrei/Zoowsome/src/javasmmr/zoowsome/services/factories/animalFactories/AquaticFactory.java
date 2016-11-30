package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.SHARK.equals(type))
		{
			return new Shark();
		}
		else if(Constants.Animals.Aquatics.OCTOPUS.equals(type))
		{ 
			return new Octopus();
		}
		else if(Constants.Animals.Aquatics.FISH.equals(type))
		{
			return new Fish();
		}
		else
			throw new Exception("Invalid animal exception");
	}
}
