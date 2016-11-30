package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class AquaticFactory extends SpeciesFactory {

	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.Abalone.equals(type)){
			return new Abalone();
		}
		else if(Constants.Animals.Aquatics.Anchovy.equals(type)){
			return new Anchovy();
		}
		else if(Constants.Animals.Aquatics.Angelfish.equals(type)){
			return new Angelfish();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}
