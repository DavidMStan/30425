package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.CAT);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
	}
	

}
