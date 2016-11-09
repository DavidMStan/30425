package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Mammals.MOUNTAIN_GOAT.equals(type) ){
			return new MountainGoat(); 
		}
		else if( Constants.Animals.Mammals.MOUNTAIN_GORILLA.equals(type) ){
			return new MountainGorilla();
		}
		else if( Constants.Animals.Mammals.MOUNTAIN_LION.equals(type) ){
			return new MountainLion();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}

