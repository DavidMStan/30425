package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Reptiles.Rattlesnake.equals(type)){
			return new Rattlesnake();
		}
		else if(Constants.Animals.Reptiles.Gecko.equals(type)){
			return new Gecko();
		}
		else if(Constants.Animals.Reptiles.Iguana.equals(type)){
			return new Iguana();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}
