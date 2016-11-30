package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Insects.ANT.equals(type) ){
			return new Ant(); 
		}else if( Constants.Animals.Insects.BEE.equals(type) ){
			return new Bee();
		}else if( Constants.Animals.Insects.BUG.equals(type) ){
			return new Bug();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
