package javasmmr.zoowsome.models.animals;
import java.util.Random;

public abstract class Animal implements Killer {

	private int nrOfLegs;
	private String name;
	private Boolean takenCareOf = false;
	private Double dangerPerc;
	Random randomGenerator = new Random();
	private double cost;
	private final double maintenanceCost = cost;
	

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Boolean getTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(int legs){
		this.nrOfLegs = legs;
	}
	
	public boolean kill(){
		return(randomGenerator.nextDouble() < dangerPerc);
		
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}
}
