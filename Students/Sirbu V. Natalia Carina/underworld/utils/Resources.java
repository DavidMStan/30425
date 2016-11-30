package underworld.utils;

import java.lang.*;

public class Resources {

	private static double random = Math.random(); // returns a number between 0
													// and 1

	public static int generateValuableResource() {
		return (int) (random * Constants.MAP_RESOURCES_NUMBER);
	}

	public static int generateResource() {
		return (int) (random * Constants.MAP_RESOURCES_NUMBER * 2);
	}

}
