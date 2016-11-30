package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.animals.*;

public class ReptileFactory extends SpeciesFactory{
	public Animal getAnimal( String type ) throws Exception {
		if( Constants.Animals.Reptiles.BLACKSNAKE.equals(type) ){
			return new BlackSnake(); 
		}else if( Constants.Animals.Reptiles.LIZARD.equals(type) ){
			return new Lizard();
		}else if( Constants.Animals.Reptiles.VIPER.equals(type) ){
			return new Viper();
		}else{
			throw new Exception("Invalid animal exception!");
		}
	}

}
