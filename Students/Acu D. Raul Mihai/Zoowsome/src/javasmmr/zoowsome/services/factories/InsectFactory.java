package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class InsectFactory  extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Insects.Caterpillar.equals(type)){
			return new Caterpillar();
		}
		else if(Constants.Animals.Insects.Centipede.equals(type)){
			return new Centipede();
		}
		else if(Constants.Animals.Insects.Cricket.equals(type)){
			return new Cricket();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
