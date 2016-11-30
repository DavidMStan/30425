package underworld.models;
import underworld.utils.*;

public class Miner {
	private static String name;
	private static int[] backpack;
	private static int backpackIndex=0;
	
	public Miner (String name){
		this.name=name;
		backpack=new int[Constants.MINER_BACKPACK_SIZE];
		for(int i=0;i<Constants.MINER_BACKPACK_SIZE;i++){
			backpack[i]=-1;
		}
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public static int dig(){
		if(isBackpackFull()==false){
			backpack[backpackIndex]=Resources.generateResource();
			return backpack[backpackIndex];
		}
		else{
			System.out.println("The bag is full");
		}
		backpackIndex++;
		return -1;
		
	}
	public static int sleep(){
		int resource= Resources.generateResource();
		System.out.println("[Miner] "+resource+" decayed during my sleep..");
		return resource;
		
	}
	private static boolean isBackpackFull(){
		boolean backpackFull=false;
		if(backpackIndex==Constants.MINER_BACKPACK_SIZE){
			backpackFull=true;
		}
		return backpackFull;
	}
	public void showBackpack(){
		System.out.println("[Miner] My backpack:");
		for(int i=0;i<Constants.MINER_BACKPACK_SIZE;i++){
			System.out.print(backpack[i]+" ");
		}
		getNumberOfBackpackSlots();
	}
	private void getNumberOfBackpackSlots(){
		int free=Constants.MINER_BACKPACK_SIZE-backpackIndex;
		System.out.println("("+free+") backpack slots left");
	}

}
