package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Mammals.MOUNTAINGOAT.equals(type) ){
			return new MountainGoat(); //leave empty constructor, for now
		}
		else if( Constants.Animals.Mammals.MOUNTAINGORILLA.equals(type) ){
			return new MountainGorilla();
		}
		else if( Constants.Animals.Mammals.MOUNTAINLION.equals(type) ){
			return new MountainLion();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}
}

