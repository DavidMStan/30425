package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Animal;

public class InsectFactory extends SpeciesFactory {
	public Animal getAnimal(String type) {
		if(Constants.Animals.Insect.Spider.equals(type)) {
			return new Spider();
		}
		else if(Constants.Animals.Insect.Butterfly.equals(type)) {
			return new Butterfly();
		}
		else if(Constants.Animals.Insect.Cockroach.equals(type)) {
			return new Cockroach();
		}
		else {
			throw new RuntimeException("Invalid Animal Exception!");
		}
	}

}
