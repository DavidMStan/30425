package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory {
	public Animal getAnimal( String type ) throws Exception{
		if( Constants.Animals.Reptiles.RETICULATE_LIZARD.equals(type) ){
			return new ReticulateLizard(); 
		}
		else if( Constants.Animals.Reptiles.RIDGEHEAD_SNAKE.equals(type) ){
			return new RidgeheadSnake();
		}
		else if( Constants.Animals.Reptiles.RUSSIAN_VIPER.equals(type) ){
			return new RussianViper();
		}
		else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
