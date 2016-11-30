package underworld.models;

import underworld.utils.Resources;

public class Miner {
	
	private String name;
	private int[] backpack;
	private int backpackIndex;
	
	public Miner (String name){
		for(int i = 0; i < backpack.length; i++) {
           backpack[i] = -1;
		}
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int dig(){
		int r=0;
		if (isBackpackFull()==false){
			Resources res=new Resources();
			r=res.generateResource();
		}
		for(int i=0; i<backpack.length; i++){
			if (backpack[i]==-1){
				backpackIndex=i;
				break;
			}
		}
		backpack[backpackIndex]=r;
		return r;
	}
	public int sleep(){
		Resources res=new Resources();
		return res.generateResource();
	}
	private boolean isBackpackFull(){
		boolean full=true;
		for(int i=0; i<backpack.length; i++){
			if (backpack[i]==-1){
				full=false;
			}
		}
		return full;
	}
	public void showBackpack(){
		for (int i=0; i<backpack.length;i++){
			System.out.println(backpack[i]);
		}
		System.out.println("The number of empty slots is "+getNumberOfBackpackSlots());
	}
	private int getNumberOfBackpackSlots(){
		int empty=0;
		for (int i=0; i<backpack.length; i++){
			if (backpack[i]==-1){
				empty++;
			}
		}
		return empty;
	}
}


