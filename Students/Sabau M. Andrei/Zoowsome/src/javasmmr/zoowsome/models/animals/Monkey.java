package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Monkey extends Mammal{

	private static int counter = 0;
	
	public Monkey(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair (percBodyHair);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Monkey(){
		this(31.9f, 95.5f, 2, "Monkey" + counter, 7.1, 0.4);
		++counter;
	} 
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.MONKEY);
	}
}
