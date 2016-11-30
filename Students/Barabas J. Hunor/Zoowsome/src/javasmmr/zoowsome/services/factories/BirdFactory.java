package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class BirdFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Birds.Eagle.equals(type)){
			return new Eagle();
		}
		else if(Constants.Animals.Birds.Falcon.equals(type)){
			return new Falcon();
		}
		else if(Constants.Animals.Birds.Stork.equals(type)){
			return new Stork();
		}
		else{
			throw new RuntimeException("Invalid animal exception!");
		}
	}
}
