package javasmmr.zoowsome.controllers;
import java.util.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.EmployeeFactory.*;


public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactoryM = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
		SpeciesFactory speciesFactoryI= abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
		SpeciesFactory speciesFactoryB = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
		SpeciesFactory speciesFactoryA = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);
		SpeciesFactory speciesFactoryR = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
		Animal a1 = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_GOAT);
		Animal a2 = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS);
		System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
		System.out.println("We have an animal that is called " + a2.getName());
		
       Random random = new Random();
        Animal[] newAnimal = new Animal[Constants.ZOO_CAPACITY];
        int randomIntAnimal;
        for(int i = 0; i < Constants.ZOO_CAPACITY; i++){
            randomIntAnimal = random.nextInt(12);
            switch (randomIntAnimal){
                case 0:
                	newAnimal[i] = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_GOAT);
                    break;
                case 1:
                	newAnimal[i] = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_GORILLA);
                    break;
                case 2:
                	newAnimal[i] = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_LION);
                    break;
                case 3:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RETICULATE_LIZARD);
                    break;
                case 4:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RIDGEHEAD_SNAKE);
                    break;
                case 5:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RUSSIAN_VIPER);
                    break;
                case 6:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS);
                    break;
                case 7:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS_BORERS);
                    break;
                case 8:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS_WEEVILS);
                    break;
                case 9:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGEL_FISH);
                    break;
                case 10:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGEL_SHARK);
                    break;
                case 11:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGLER_FISH);
                    break;
                case 12:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BLACKBIRD);
                    break;
                case 13:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BLUEBIRD);
                    break;
                case 14:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BROOD);
                    break;
            }
        }
        for (int i = 0; i < Constants.ZOO_CAPACITY; i++){
        	          System.out.printf("We have an %s with %d legs!\n", newAnimal[i].getName(), newAnimal[i].getNrOfLegs());

        	}
		CareTakerFactory careTakerFactory = new CareTakerFactory();
		Employee[] careTakerEmployee = new Employee[30];
		for(int i = 0; i < 20; i++){
			careTakerEmployee[i] = careTakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
		}

		for(Employee c: careTakerEmployee){
			 for(Animal a: newAnimal){
				 if ( !(c.getIsDead()) || a.getTakenCareOf()){
					 String result = ((CareTaker)c).takeCareOf(a);
	        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
			         		c.setIsDead(true);
	        			}
			         	else if( result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
			         		continue;
		       			}
	        			else if (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)){
		       				a.setTakenCareOf(true);
		     			}
		       	}
		     }
		}
	    int i = 0;
	    for(Animal a: newAnimal){
        	System.out.println("Animal #" + i++ + " " + a.getName() + ":\t maintenanceCost = " + a.getMaintenanceCost() + " hours/week;\t takenCareOf = " + a.getTakenCareOf());
        }
        for(Employee e: careTakerEmployee){
        	System.out.println(e.getName() + " id: " + e.getId() + " " + ((CareTaker)e).getWorkingHours() + "hours dead = " + e.getIsDead());
        }
	
	}
}

