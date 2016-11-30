package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Insects.IRIS.equals(type) ){
			return new Iris(); //leave empty constructor, for now
		}
		else if( Constants.Animals.Insects.IRISBORERS.equals(type) ){
			return new IrisBorers();
		}
		else if( Constants.Animals.Insects.IRISWEEVILS.equals(type) ){
			return new IrisWeevils();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
