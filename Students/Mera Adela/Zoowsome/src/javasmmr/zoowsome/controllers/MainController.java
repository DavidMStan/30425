package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.*;
//import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.animals.*;

public class MainController {
	
	public static void main(String[] args) throws Exception {
		AnimalFactory animalFactory = new AnimalFactory();
		//CaretakerFactory caretakerFactory = new CaretakerFactory();  
		SpeciesFactory speciesFactory1 = animalFactory.getSpeciesFactory(Constants.Species.Mammal);
		SpeciesFactory speciesFactory2 = animalFactory.getSpeciesFactory(Constants.Species.Bird);
		SpeciesFactory speciesFactory3 = animalFactory.getSpeciesFactory(Constants.Species.Aquatic);
		Animal[] a = new Animal [5];
		a[0] = speciesFactory2.getAnimal(Constants.Animals.Bird.Stork);
		a[1] = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow);
		a[2] = speciesFactory3.getAnimal(Constants.Animals.Aquatic.Fish);
		a[3] = speciesFactory2.getAnimal(Constants.Animals.Bird.Pigeon);
		a[4] = speciesFactory1.getAnimal(Constants.Animals.Mammal.Cow); 
		AnimalRepository animalRepository = new AnimalRepository();
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(a[0]);
		animals.add(a[1]);
		animals.add(a[2]);
		animals.add(a[3]);
		animals.add(a[4]);
		animalRepository.save(animals);
		/*Caretaker[] c = new Caretaker [3];
		c[0] = new Caretaker();
		c[1] = new Caretaker();
		c[2] = new Caretaker();
		//c[0] = caretakerFactory.getEmployee(Constants.Employees.Caretaker.TCO_SUCCESS);
		//c[1] = caretakerFactory.getEmployee(Constants.Employees.Caretaker.TCO_KILLED);
		//c[2] = caretakerFactory.getEmployee(Constants.Employees.Caretaker.TCO_NO_TIME);
		//System.out.println("We have an animal with " + a1.getNrOfLegs()+ " legs!\n");
		for (int i=0; i<3; i++){
			for (int j=0; j<5; j++){
				if((c[i].getIsDead()==false) && (a[j].getTakenCareOf()==false)){
					String result = c[i].takeCareOf(a[j]);
					if(result.equals(Constants.Employees.Caretaker.TCO_KILLED)){
						System.out.println("The caretaker is dead");
					}
					else if(result.equals(Constants.Employees.Caretaker.TCO_SUCCESS)){
						a[j].setTakenCareOf(true);
						System.out.println(a[j].getName()+" is taken care of by "+ c[i].getName());
					}
				}
			}
		}*/
	}
}

