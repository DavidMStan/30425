package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class ReptileFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Reptiles.KOMODO.equals(type))
		{
			return new Komodo();
		}
		else if(Constants.Animals.Reptiles.CROCODILE.equals(type))
		{
			return new Crocodile();
		}
		else if(Constants.Animals.Reptiles.BLACKMAMBA.equals(type))
		{
			return new BlackMamba();
		}
		else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}

