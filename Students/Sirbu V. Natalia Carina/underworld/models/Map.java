package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Map {
	private int[] resources;
	
	public Map() {
		this.resources = null;
	}
	
	public void generateResources() {
		resources = new int [Constants.MAP_RESOURCES_NUMBER];
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER ; i++) {
			resources[i] = Resources.generateValuableResource();
		}
		
	}
	
	public boolean consumeResource(int resource) {
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			if (resource == resources[i]) {
				resources[i] = -1;
				return true;
			}
		}
		return false; 
	}
	
	public void showResources() {
		for (int i = 0; i < Constants.MAP_RESOURCES_NUMBER; i++) {
			System.out.print(resources[i] + " ");
		}
	}
}
