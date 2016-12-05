package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

//import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Fish extends Aquatic {
	
	public Fish(double maintenanceCost, double dangerPerc, 
			int nrOfLegs, String name, int avgSwimDepth, waterType typeOfWater, boolean takenCareOf){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setTypeOfWater(typeOfWater);
		setTakenCareOf(takenCareOf);
	}
	public Fish(){
		
		this(0.1, 0.0, 0, "Fish", 100, waterType.freshwater, false);
	}

	public boolean kill() {
		if (Math.random() < this.dangerPerc){
			return true;
		}
		else{
			return false;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Fish);
	}

	public void decodeFromXml(Element element) {
		
	}

}
