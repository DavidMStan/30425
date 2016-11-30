package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.MOUNTAINGOAT);
		Animal a2 = speciesFactory2.getAnimal(Constants.Animals.Insects.IRIS);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		System.out.println("We have an animal that is called " + a2.getName());
	}
}
