package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Reptiles.RATTLESNAKE.equals(type)){
			return new Rattlesnake();
		}
		else if(Constants.Animals.Reptiles.GECKO.equals(type)){
			return new Gecko();
		}
		else if(Constants.Animals.Reptiles.IGUANA.equals(type)){
			return new Iguana();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}
