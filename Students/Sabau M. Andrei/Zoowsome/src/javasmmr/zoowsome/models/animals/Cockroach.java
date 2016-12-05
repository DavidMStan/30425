package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Cockroach extends Insect {

	private static int counter = 0;
	
	public Cockroach(boolean canFly, boolean isDangerous, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setCanFly(canFly);
		setIsDangerous(isDangerous);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Cockroach(){
		this(false, false, 6, "Cockroach" + counter, 0.1, 0.1);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.COCKROACH);
	}
}
