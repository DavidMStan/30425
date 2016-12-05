package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Butterfly extends Insect{

	private static int counter = 0;
	
	public Butterfly(boolean canFly, boolean isDangerous, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
		}
	
	public Butterfly(){
		this(true, false, 6, "Butterfly" + counter, 0.1, 0);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.BUTTERFLY);
	}
}
