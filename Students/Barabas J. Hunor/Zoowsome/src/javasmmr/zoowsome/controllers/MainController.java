package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Employee;

public class MainController {

	public static void main(String[] args){
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
		Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Aquatics.ANGLERFISH);
		System.out.println("We have an animal: A(n) " + a1.getName());
		
	   CaretakerFactory caretakerFactory = new CaretakerFactory();
	   //Testing if the ID works as intended
	   Employee employee1 = caretakerFactory.getEmployee(Constants.Employees.CARETAKER);
	   System.out.println("We have an employee with the ID of: "+ employee1.getId());
	   Employee employee2 = caretakerFactory.getEmployee(Constants.Employees.CARETAKER);
	   System.out.println("We have another employee with the ID of: " + employee2.getId());
	}

}
