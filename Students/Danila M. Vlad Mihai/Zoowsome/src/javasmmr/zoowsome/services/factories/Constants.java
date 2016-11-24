package javasmmr.zoowsome.services.factories;

public final class Constants {
	public static final int ZOO_CAPACITY = 10;
	public static final int NR_ANIMALS = 10;
	public static final int NR_EMPLOYEES = 25;
	
	public static final class Species {
		public static final String MAMMALS = "Mammals";
		public static final String REPTILES = "Reptiles";
		public static final String BIRDS = "Birds";
		public static final String AQUATICS = "Aquatics";
		public static final String INSECTS = "Insects";
	}
	public static final class Animals {
		public static final class Mammals {
			public static final String MOUNTAIN_GOAT = "MountainGoat";
			public static final String MOUNTAIN_GORILLA = "MountainGorilla";
			public static final String MOUNTAIN_LION = "MountainLion";
		}
		public static final class Reptiles {
			public static final String RETICULATE_LIZARD = "ReticulateLizard";
			public static final String RIDGEHEAD_SNAKE = "RidgeheadSnake";
			public static final String RUSSIAN_VIPER = "RussianViper";
		}
		public static final class Birds {
			public static final String BLACKBIRD = "Blackbird";
			public static final String BLUEBIRD = "Bluebird";
			public static final String BROOD = "Brood";
		}
		public static final class Aquatics {
			public static final String ANGEL_FISH = "Angelfish";
			public static final String ANGEL_SHARK = "Angelshark";
			public static final String ANGLER_FISH = "Anglerfish";
		}
		public static final class Insects {
			public static final String IRIS = "Iris";
			public static final String IRIS_BORERS = "IrisBorers";
			public static final String IRIS_WEEVILS = "IrisWeevils";
		}
		
	}
	public static final class Employees{
		public static final String CARETAKER = "CareTaker";
		
		public static final class Caretakers{
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}
	}
	public static final class XML_TAGS{
 		public static final String ANIMAL = "ANIMAL";
 		public static final String DISCRIMINANT = "DISCRIMINANT";
	}
}