package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class MainController {

	public static void main(String[] args)
	{
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.Piranha);
		System.out.println("We have an animal: A(n) " + a1.getName());
	}
}
