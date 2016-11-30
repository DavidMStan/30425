package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Hippopotamus;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticsFactory extends SpeciesFactory {

	public Animal getAnimal(String type) {

		if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
			return new Dolphin(); // leave empty constructor, for now!

		} else if (Constants.Animals.Aquatics.Hippopotamus.equals(type)) {
			return new Hippopotamus();

		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
			throw new Exception("Invalid animal exception!");
		}
	}

}
