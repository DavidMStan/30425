package javasmmr.zoowsome.models.animals;

import java.util.Date;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.*;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {

	private int nrOfLegs;
	private String name;
	private double maintenanceCost;//how many hours per week will a specific animal require attention from one or more employees; values are in [0.1, 8.0] interval
	private double dangerPerc;//how dangerous an animal is; values are in [0, 1] interval
	private boolean takenCareOf = false;
	
	Date date = new Date();
	
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
	
	public boolean getTakenCareOf(){
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf){
		this.takenCareOf = takenCareOf;
	}
	
	public boolean kill(){
		
		return (Math.random() < dangerPerc + getPredisposition());
		//If the generated number is strictly bellow the dangerPerc field, then return true 
		//(meaning, the animal kills the interacting entity), else return false
		 
	}
	
	public double getPredisposition(){
		return 0;
	}
	
	public boolean timeBetween11pmAnd6am(){
		String dateString = date.toString(); // it will be for ex: "Tue Nov 08 14:25:56 EET 2016"
		
		dateString = dateString.substring(11,13);
		
		int time = Integer.parseInt(dateString);
		
		return (time >= 23 || time <= 6);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}
	public void decodeFromXml(Element element){
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}
	
}
