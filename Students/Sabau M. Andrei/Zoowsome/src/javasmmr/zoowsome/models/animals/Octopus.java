package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;
import javasmmr.zoowsome.services.factories.Constants;

public class Octopus extends Aquatic{

	private static int counter = 0;
	
	public Octopus(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(typeOfWater);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Octopus(){
		this(43, waterType.saltWater, 0, "Octopus" + counter, 2.19, 0.4);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.OCTOPUS);
	}
}
