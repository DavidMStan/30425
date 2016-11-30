package underworld.models;

import underworld.utils.Resources;

public class Map {

	int[] resources= new int[10];
	
	public Map(){
		for(int i = 0; i < resources.length; i++) {
            resources[i] = 0;
		}
	}
	public void generateResources(){
		for(int i=0; i<resources.length; i++){
			resources[i]=Resources.generateValuableResource();
		}	
	}
	public boolean consumeResources(int resource){
		boolean found=false;
		for(int i=0; i<resources.length; i++){
			if(resource==resources[i]){
				found=true;
				resources[i]=-1;
			}
		}
        return found;
	}
		
	public void showResources(){
		for (int i=0; i<resources.length;i++){
			System.out.println(resources[i]);
		}
	}
}
