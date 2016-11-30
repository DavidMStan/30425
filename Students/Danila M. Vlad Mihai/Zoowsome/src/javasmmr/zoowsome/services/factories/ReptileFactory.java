package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Reptiles.RETICULATELIZARD.equals(type) ){
			return new ReticulateLizard(); //leave empty constructor, for now
		}
		else if( Constants.Animals.Reptiles.RIDGEHEADSNAKE.equals(type) ){
			return new RidgeheadSnake();
		}
		else if( Constants.Animals.Reptiles.RUSSIANVIPER.equals(type) ){
			return new RussianViper();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
