package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Lizard extends Reptile {

	private static int counter = 0;
	
	public Lizard(boolean laysEggs, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setLaysEggs(laysEggs);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Lizard(){
		this(true, 4, "Lizard" + counter, 1, 0.02);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.LIZARD);
	}
}

