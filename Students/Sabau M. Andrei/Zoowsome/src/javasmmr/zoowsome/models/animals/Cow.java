package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cow extends Mammal {

	private static int counter = 0;
	
	public Cow(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair (percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Cow(){
		this(34.1f, 87.9f, 4, "Cow" + counter, 0.77, 0);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.COW);
	}
} 
