package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	public Animal getAnimal (String type ) {
		if(Constants.Animals.Aquatic.Jellyfish.equals(type)) {
			return new Jellyfish() ;
		}
		else if(Constants.Animals.Aquatic.Shark.equals(type)) {
			return new Shark() ;
		}
		else if(Constants.Animals.Aquatic.Whale.equals(type)) {
			return new Whale() ;
		}
		else{
			throw new RuntimeException("Invalid Animal Exception!");
		}
	
	}
}
