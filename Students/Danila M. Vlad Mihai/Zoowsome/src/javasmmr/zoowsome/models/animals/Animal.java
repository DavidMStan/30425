package javasmmr.zoowsome.models.animals;
import java.util.*;
public abstract class Animal implements Killer {
	 private int nrOfLegs;
	 private String name;
	 private double maintenanceCost;
	 private double dangerPerc;
	 private boolean takenCareOf = false;
	 
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
		 this.maintenanceCost = maintenanceCost;
	 }
	 public double getDangerPerc(){
		 return dangerPerc;
	 }
	 public void setDangerPerc(double dangerPerc){
		 this.dangerPerc = dangerPerc;
	 }
	 public boolean kill(){
		 if(Math.random() < dangerPerc){
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 public boolean getTakenCareOf(){
		 return takenCareOf;
	 }
	 public void setTakenCareOf(boolean takenCareOf){
		 this.takenCareOf = takenCareOf;
	 }
	 
}
