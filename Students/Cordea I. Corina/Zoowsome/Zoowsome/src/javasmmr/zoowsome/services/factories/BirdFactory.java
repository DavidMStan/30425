package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Birds.CUCKOO.equals(type) ){
			return new Cuckoo(); 
		}else if( Constants.Animals.Birds.EAGLE.equals(type) ){
			return new Eagle();
		}else if( Constants.Animals.Birds.HAWK.equals(type) ){
			return new Hawk();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
