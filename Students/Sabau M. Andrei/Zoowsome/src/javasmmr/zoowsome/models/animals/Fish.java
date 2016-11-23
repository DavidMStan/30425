package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;
import javasmmr.zoowsome.services.factories.Constants;

public class Fish extends Aquatic{

	private static int counter = 0;
	
	public Fish(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(typeOfWater);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Fish(){
		this(5, waterType.freshWater, 0, "Fish" + counter, 0.5, 0);
		++counter;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.FISH);
	}
}
