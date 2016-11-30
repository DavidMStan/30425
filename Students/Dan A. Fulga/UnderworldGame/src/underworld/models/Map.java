package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;


public class Map {
	
	int nrOfResources = Constants.MAP_RESOURCES_NUMBER;
	private int[] resources = new int [ nrOfResources ];
	
	public Map () {
		
		int i;
		for(i = 0; i < nrOfResources; i++) {
			
			resources[i] = -1;
		}
		
		
	}

	public void generateResources() {
		
		int i;
		for( i = 0; i < nrOfResources; i++) {
			
			resources[i]=Resources.generateValuableResource();
		}
		
	}
	
	
	
	public  boolean consumeResources (int resource) {
		
		
		int i;
		for (i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			
			if( resources[i]==resource) {
				
				
				resources[i] = -1;
				return true;
				
			}
			
		}
		 return false;
		
	}
	
	public void showResources (){
		
		System.out.print("Map[] Resources ");
		int i;
		for( i = 0; i < nrOfResources; i++){
			System.out.println(resources[i] + " ");
		}
		
	}
	

}
