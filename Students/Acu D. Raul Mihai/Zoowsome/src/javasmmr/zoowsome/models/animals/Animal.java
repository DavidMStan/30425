package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.models.interfaces.*;
import java.util.Random;

public abstract class Animal implements Killer{	
	
	private int nrOfLegs;
	private String name;
	private double mCost;
	private final double maintenanceCost = mCost;
	private double dPerc;
	private final double dangerPerc = dPerc;
	private boolean takenCareOf = false;
	
	Random generateRandomNumber = new Random();
	
	public int getNrOfLegs(){
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs){
		this.nrOfLegs = nrOfLegs;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getMaintenanceCost(){
		return maintenanceCost;
	}
	public void setMaintenanceCost(double maintenanceCost){
		maintenanceCost = mCost;
	}
	public double getDangerPerc(){
		return dangerPerc;
	}
	public void setDangerPerc(double dangerPerc){
		dangerPerc = dPerc;
	}
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	public boolean kill(){
		double randomNumber = generateRandomNumber.nextDouble();
			if (randomNumber < dangerPerc){
				return true;
			}else
				return false;
	}
}
