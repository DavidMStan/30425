package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory  extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.Bobolink.equals(type)){
			return new Bobolink();
		}
		else if(Constants.Animals.Birds.Brant.equals(type)){
			return new Brant();
		}
		else if(Constants.Animals.Birds.Bushtit.equals(type)){
			return new Bushtit();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
