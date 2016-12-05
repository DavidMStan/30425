package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class InsectFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Insects.ANT.equals(type))
		{
			return new Ant();
		}
		else if(Constants.Animals.Insects.BEETLE.equals(type))
		{
			return new Beetle();
		}
		else if(Constants.Animals.Insects.MANTIS.equals(type))
		{
			return new Mantis();
		}
		else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}

