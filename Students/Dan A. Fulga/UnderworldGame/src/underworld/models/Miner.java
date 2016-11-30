package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {
	private String name;
	private int SizeOfBackpack = Constants.MINER_BACKPACK_SIZE;
	private int backpack[] = new int[SizeOfBackpack];
	private int backpackIndex=0;
	
	public Miner(String name){
		this.name=name;
		int i;
		for(i = 0; i < SizeOfBackpack ; i++) {
			backpack[i] = -1;
		}
		
	}
	
	public String getName(){
		
		return this.name;
		
	}
	
	public void  setName(String name) {
		
		this.name=name;
		
	}
	
	public int Dig() {
		
		if ( isBackpackFull() == true){
			System.out.println("I have everything I need in here!");
			}
		else {
			backpack[backpackIndex]=Resources.generateResource();
			System.out.println("Just found this 'treasure'" + backpack[backpackIndex]);
			return backpack[ backpackIndex ++];
			
		}
		
	return -1;
		
	}
	
	public int Sleep() {
		
		int resource;
		resource = Resources.generateResource();
		System.out.println("This " + resource +  " fell because I needed a nap");
		return resource;
		
		
	}
	private boolean isBackpackFull() {
		
		if ( backpackIndex == SizeOfBackpack) {
			return true;
		}
	return false;
		
	}
	
	
	public void showBackpack() {
		
		int i;
		for ( i = 0; i < SizeOfBackpack; i++) {
			
			System.out.println("YAY I GOT ALL THESE USELESS THINGS " + backpack[i]);
			
		}
		getNumberOfBackpackSlots();
		
	}
	
	public void getNumberOfBackpackSlots () {
		
		int nrOfSlotsAvailable;
		nrOfSlotsAvailable = SizeOfBackpack - backpackIndex;
		System.out.println("I love sleeping, so I have " + nrOfSlotsAvailable + "slots unoccupied in my backpack :( BEWARE! MY HUNT CONTINUES ");
		
	}
	
}
