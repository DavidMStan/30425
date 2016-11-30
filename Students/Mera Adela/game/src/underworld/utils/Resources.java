package underworld.utils;

import java.util.Random;

public class Resources {
	
	static Random random=new Random();

	public static int generateValuableResource(){
		int limit=Constants.MAP_RESOURCES_NUMBER+1;
		int number = random.nextInt(limit);
		return number;
	}
	public int generateResource(){
		int limit=(Constants.MAP_RESOURCES_NUMBER*2)+1;
		int number = random.nextInt(limit);
		return number;
		
	}
	
}
