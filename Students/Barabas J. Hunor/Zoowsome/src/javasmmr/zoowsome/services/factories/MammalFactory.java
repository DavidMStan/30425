package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class MammalFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Mammals.Elephant.equals(type))
		{
			return new Elephant();
		}
		else if(Constants.Animals.Mammals.Cheetah.equals(type))
		{
			return new Cheetah();
		}
		else if(Constants.Animals.Mammals.PolarBear.equals(type))
		{
			return new PolarBear();
		}
		else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}
