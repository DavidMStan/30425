package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;


public class MammalFactory extends SpeciesFactory {
	
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Mammals.Manatee.equals(type)){
			return new Manatee();
		}
		else if(Constants.Animals.Mammals.Moose.equals(type)){
			return new Moose();
		}
		else if(Constants.Animals.Mammals.Mongoose.equals(type)){
			return new Mongoose();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
