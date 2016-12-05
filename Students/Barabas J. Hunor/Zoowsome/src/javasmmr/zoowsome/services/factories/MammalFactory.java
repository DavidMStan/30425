package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class MammalFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Mammals.ELEPHANT.equals(type))
		{
			return new Elephant();
		}
		else if(Constants.Animals.Mammals.CHEETAH.equals(type))
		{
			return new Cheetah();
		}
		else if(Constants.Animals.Mammals.POLARBEAR.equals(type))
		{
			return new PolarBear();
		}
		else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}
