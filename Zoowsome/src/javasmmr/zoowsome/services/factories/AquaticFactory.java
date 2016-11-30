package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Aquatics.Anglerfish.equals(type))
		{
			return new AnglerFish();
		}else if(Constants.Animals.Aquatics.Salmon.equals(type)){
			return new Salmon();
		}else if(Constants.Animals.Aquatics.Piranha.equals(type)){
			return new Piranha();
		}else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}

