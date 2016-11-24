package javasmmr.zoowsome.controllers;
import java.util.*;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;
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
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println("Body temperature : " +( (Mammal)newAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)newAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("------------");
                    break;
                case 1:
                	newAnimal[i] = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_GORILLA);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println("Body temperature : " +( (Mammal)newAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)newAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("------------");
                    break;
                case 2:
                	newAnimal[i] = speciesFactoryM.getAnimal(Constants.Animals.Mammals.MOUNTAIN_LION);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println("Body temperature : " +( (Mammal)newAnimal[i] ).getNormalBodyTemp() );
					System.out.println( ( (Mammal)newAnimal[i] ).getPercBodyHair() +" % of its body is covered with hair");
					System.out.println("------------");
                    break;
                case 3:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RETICULATE_LIZARD);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Reptile)newAnimal[i]).getLaysEggs() ) {
						System.out.println(newAnimal[i].getName()+" lays eggs");
					}
					System.out.println("------------");
                    break;
                case 4:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RIDGEHEAD_SNAKE);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Reptile)newAnimal[i]).getLaysEggs() ) {
						System.out.println(newAnimal[i].getName()+" lays eggs");
					}
					System.out.println("------------");
                    break;
                case 5:
                	newAnimal[i] = speciesFactoryR.getAnimal(Constants.Animals.Reptiles.RUSSIAN_VIPER);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Reptile)newAnimal[i]).getLaysEggs() ) {
						System.out.println(newAnimal[i].getName()+" lays eggs");
					}
					System.out.println("------------");
                    break;
                case 6:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Insect)newAnimal[i]).getCanFly() ) {
						System.out.println(newAnimal[i].getName()+" can fly");
					} else {
						System.out.println(newAnimal[i].getName()+" can't fly");
					}
					if ( ((Insect)newAnimal[i]).getIsDangerous() ) {
						System.out.println("That is  a DANGREOUS insect!");
					} else {
						System.out.println("That is NOT a dangerous insect!");
					}
					System.out.println("------------");
                    break;
                case 7:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS_BORERS);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Insect)newAnimal[i]).getCanFly() ) {
						System.out.println(newAnimal[i].getName()+" can fly");
					} else {
						System.out.println(newAnimal[i].getName()+" can't fly");
					}
					if ( ((Insect)newAnimal[i]).getIsDangerous() ) {
						System.out.println("That is  a DANGREOUS insect!");
					} else {
						System.out.println("That is NOT a dangerous insect!");
					}
					System.out.println("------------");
                    break;
                case 8:
                	newAnimal[i] = speciesFactoryI.getAnimal(Constants.Animals.Insects.IRIS_WEEVILS);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if ( ((Insect)newAnimal[i]).getCanFly() ) {
						System.out.println(newAnimal[i].getName()+" can fly");
					} else {
						System.out.println(newAnimal[i].getName()+" can't fly");
					}
					if ( ((Insect)newAnimal[i]).getIsDangerous() ) {
						System.out.println("That is  a DANGREOUS insect!");
					} else {
						System.out.println("That is NOT a dangerous insect!");
					}
					System.out.println("------------");
                    break;
                case 9:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGEL_FISH);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println(newAnimal[i].getName()+" lives in  "+ ((Aquatic)newAnimal[i]).getWaterType());
					System.out.println("Average swim depth is "+ ((Aquatic)newAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("------------");
                    break;
                case 10:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGEL_SHARK);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println(newAnimal[i].getName()+" lives in "+ ((Aquatic)newAnimal[i]).getWaterType());
					System.out.println("Average swim depth is "+ ((Aquatic)newAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("------------");
                    break;
                case 11:
                	newAnimal[i] = speciesFactoryA.getAnimal(Constants.Animals.Aquatics.ANGLER_FISH);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					System.out.println(newAnimal[i].getName()+" lives in "+ ((Aquatic)newAnimal[i]).getWaterType());
					System.out.println("Average swim depth is "+ ((Aquatic)newAnimal[i]).getAvgSwimDepth() + " meters" );
					System.out.println("------------");
                    break;
                case 12:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BLACKBIRD);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if(  ((Bird)newAnimal[i]).getMigrates() ) {
						System.out.println(newAnimal[i].getName()+" migrates");
					} else {
						System.out.println(newAnimal[i].getName()+" doesn't migrate");
					}
					System.out.println("Average flight altitude is "+ ((Bird)newAnimal[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("------------");
                    break;
                case 13:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BLUEBIRD);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if(  ((Bird)newAnimal[i]).getMigrates() ) {
						System.out.println(newAnimal[i].getName()+" migrates");
					} else {
						System.out.println(newAnimal[i].getName()+" doesn't migrate");
					}
					System.out.println("Average flight altitude is "+ ((Bird)newAnimal[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("------------");
                    break;
                case 14:
                	newAnimal[i] = speciesFactoryB.getAnimal(Constants.Animals.Birds.BROOD);
                	System.out.println("------------");
					System.out.println("ZoOoO new: : "+newAnimal[i].getName());
					System.out.println(newAnimal[i].getName()+" has "+newAnimal[i].getNrOfLegs()+" legs");
					if(  ((Bird)newAnimal[i]).getMigrates() ) {
						System.out.println(newAnimal[i].getName()+" migrates");
					} else {
						System.out.println(newAnimal[i].getName()+" doesn't migrate");
					}
					System.out.println("Average flight altitude is "+ ((Bird)newAnimal[i]).getAvgFlightAltitude()+ " meters" );
					System.out.println("------------");
                    break;
            }
        }

		CareTakerFactory careTakerFactory = new CareTakerFactory();
		Employee[] careTakerEmployee = new Employee[Constants.NR_EMPLOYEES];
		for(int i = 0; i < Constants.NR_EMPLOYEES; i++){
			careTakerEmployee[i] = careTakerFactory.getEmployeeFactory(Constants.Employees.CARETAKER);
		}

		for(Employee c: careTakerEmployee){
			 for(Animal animal: newAnimal){
				 if ( !(c.getIsDead()) && !(animal.getTakenCareOf())){
					 String result = ((CareTaker)c).takeCareOf(animal);
	        			if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
			         		c.setIsDead(true);
	        			}
			         	else if( result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
			         		continue;
		       			}
	        			else if (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)){
		       				animal.setTakenCareOf(true);
		     			}
		       	}
		     }
		}
    	int i = 0, j=0;
	    for(Animal animal: newAnimal){
	    	System.out.println("Animal " + i++ + " -> " + animal.getName() + " maintenanceCost = " + animal.getMaintenanceCost() + " hours/week; takenCareOf = " + animal.getTakenCareOf());
	    	System.out.println();
			}
	    for(Employee c: careTakerEmployee){
	    	System.out.println(c.getName() + j++ + " id: " + c.getId() + " " + ((CareTaker)c).getWorkingHours() + " hours -> dead = " + c.getIsDead());
	    	System.out.println();
	    }
	    
	    
			AnimalRepository repositoryObject = new AnimalRepository();
			ArrayList <Animal> animalsArray1 = new ArrayList<Animal>();
			
			for(i = 0; i < Constants.NR_ANIMALS; i++){
				animalsArray1.add(newAnimal[i]);
			}
			
 			repositoryObject.save(animalsArray1);
			
			ArrayList<Animal> animalsArray2 = new ArrayList<Animal>();
 			animalsArray2 = repositoryObject.load();
			for(int m = 0; m< animalsArray2.size() ; m++){
				System.out.println(animalsArray2.get(m).toString());
			}
	
	}
}




