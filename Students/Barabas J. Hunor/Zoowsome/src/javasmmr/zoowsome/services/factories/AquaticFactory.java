package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.controllers.*;

public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) 
	{
		if(Constants.Animals.Aquatics.ANGLERFISH.equals(type))
		{
			return new AnglerFish();
		}else if(Constants.Animals.Aquatics.SALMON.equals(type)){
			return new Salmon();
		}else if(Constants.Animals.Aquatics.PIRANHA.equals(type)){
			return new Piranha();
		}else{
			throw new RuntimeException("Invalid animal exception");
		}
	}
}

