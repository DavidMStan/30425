package javasmmr.zoowsome.services.factories.animalFactories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class ReptileFactory extends SpeciesFactory{

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Reptiles.SNAKE.equals(type))
		{
			return new Snake();
		}
		else if(Constants.Animals.Reptiles.LIZARD.equals(type))
		{
			return new Lizard();
		}
		else if(Constants.Animals.Reptiles.CROCODILE.equals(type))
		{
			return new Crocodile();
		}
		else
			throw new Exception("Invalid animal exception");
	}
}

