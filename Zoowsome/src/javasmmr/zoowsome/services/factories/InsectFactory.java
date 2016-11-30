package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class InsectFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Insects.Ant.equals(type))
		{
			return new Ant();
		}
		else if(Constants.Animals.Insects.Beetle.equals(type))
		{
			return new Beetle();
		}
		else if(Constants.Animals.Insects.Mantis.equals(type))
		{
			return new Mantis();
		}
		else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}

