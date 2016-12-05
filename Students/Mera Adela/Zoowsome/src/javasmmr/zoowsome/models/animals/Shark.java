package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

//import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Shark extends Aquatic {
	
	public Shark(double maintenanceCost, double dangerPerc, 
			int nrOfLegs, String name, int avgSwimDepth, waterType typeOfWater, boolean takenCareOf){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setTypeOfWater(typeOfWater);
		setTakenCareOf(takenCareOf);
	}
	public Shark(){
		
		this(8.0, 1, 0, "Shark", 155, waterType.freshwater, false);
	}

	public boolean kill() {
		if (Math.random() < this.dangerPerc){
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Shark);
	}
	
	public void decodeFromXml(Element element) {
		
	}

}
