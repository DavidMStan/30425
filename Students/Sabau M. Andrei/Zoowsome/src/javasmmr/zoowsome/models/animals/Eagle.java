package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Eagle extends Bird {

	private static int counter = 0;
	
	public Eagle(boolean migrates, int avgFlightAltitude, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Eagle(){
		this(true, 50, 2, "Eagle" + counter, 6.2, 0.77);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.EAGLE);
	}
}
