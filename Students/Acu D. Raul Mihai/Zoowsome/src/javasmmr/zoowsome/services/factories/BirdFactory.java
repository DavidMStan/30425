package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory  extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.BOBOLINK.equals(type)){
			return new Bobolink();
		}
		else if(Constants.Animals.Birds.BRANT.equals(type)){
			return new Brant();
		}
		else if(Constants.Animals.Birds.BUSHTIT.equals(type)){
			return new Bushtit();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
