package underworld.utils;

import java.util.Random;


public class Resources {
	
	private static Random random= new Random();
	public static int generateValuableResource (){
		
		int nr;
		nr = Constants.MAP_RESOURCES_NUMBER;
		
		return random.nextInt( nr );
		
		}
	
	
	public static int generateResource (){
		
		return random.nextInt(Constants.MAP_RESOURCES_NUMBER * 2 );
		
	}
	

}
