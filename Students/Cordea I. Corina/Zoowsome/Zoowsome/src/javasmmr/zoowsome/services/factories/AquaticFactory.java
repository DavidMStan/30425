package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Aquatics.CRAP.equals(type) ){
			return new Crap(); 
		}else if( Constants.Animals.Aquatics.SALMON.equals(type) ){
			return new Salmon();
		}else if( Constants.Animals.Aquatics.SHARK.equals(type) ){
			return new Shark();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
