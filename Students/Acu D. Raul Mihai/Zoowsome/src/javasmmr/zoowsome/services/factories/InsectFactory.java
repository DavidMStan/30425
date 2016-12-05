package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory  extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Insects.CATERPILLAR.equals(type)){
			return new Caterpillar();
		}
		else if(Constants.Animals.Insects.CENTIPEDE.equals(type)){
			return new Centipede();
		}
		else if(Constants.Animals.Insects.CRICKET.equals(type)){
			return new Cricket();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
