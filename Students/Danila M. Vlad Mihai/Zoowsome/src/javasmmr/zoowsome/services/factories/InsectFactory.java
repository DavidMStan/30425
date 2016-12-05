package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Insects.IRIS.equals(type) ){
			return new Iris(); 
		}
		else if( Constants.Animals.Insects.IRIS_BORERS.equals(type) ){
			return new IrisBorers();
		}
		else if( Constants.Animals.Insects.IRIS_WEEVILS.equals(type) ){
			return new IrisWeevils();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
