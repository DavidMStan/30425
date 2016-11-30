package underworld.models;

import underworld.utils.Constants;
import underworld.utils.Resources;

public class Miner {

	private String name;
	private int[] backpack;
	private int backpackIndex;
	
	public Miner(String name) {
		backpack = new int [Constants.MINER_BACKPACK_SIZE];
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++)
			backpack[i] = -1;
		this.name = name;
	}
	
	public int backpackSearch() {
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++)
			if (backpack[i] == -1)
				return i;
		return -1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int dig() {
		
		if (isBackpackFull()) 
			return -1;
		else {
			int x = Resources.generateResource();
			backpackIndex = backpackSearch();
			backpack[backpackIndex] = x;
			return x;
		}		
	}
	
	public int sleep() {
		return Resources.generateResource();
	}
	
	private boolean isBackpackFull() {
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++)
			if (backpack[i] == -1) 
				return false;
		return true;
	}
	
	public void showBackpack() {
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++)
			System.out.print(backpack[i] + " ");
	}
	
	private int getNumberOfBackpackSlots() {
		int emptySlots = 0;
		for (int i = 0; i < Constants.MINER_BACKPACK_SIZE; i++)
			if (backpack[i] == -1)
				emptySlots++;
		return emptySlots;
	}
}