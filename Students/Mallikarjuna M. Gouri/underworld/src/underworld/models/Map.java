package underworld.models;
import underworld.utils.*;

public class Map {
	private static int[] resources;
	public Map(){
		this.resources=null;
	}
	public void generateResources(){
		for(int i=0;i<Constants.MAP_RESOURCES_NUMBER;i++){
			resources[i]=Resources.generateValuableResources();
		}
		
	}
	public static boolean consumeResource(int resource){
		boolean resourceFound=false;
		for (int i=0;i<Constants.MAP_RESOURCES_NUMBER;i++){
			if(resources[i]==resource){
				resources[i]=-1;
						resourceFound=true;
			}
		}
		return resourceFound;
	}
	
	
	public void showResources(){
		System.out.println("[Map] Resources: ");
		for (int i=0;i<Constants.MAP_RESOURCES_NUMBER;i++){
			System.out.println(resources + " ");
		}
	}
}
