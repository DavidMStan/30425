package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Shark extends Aquatic{

	private static int counter = 0;
	
	public Shark(int avgSwimDepth, waterType typeOfWater, int nrOfLegs, String  name, double maintenanceCost, double dangerPerc){
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(typeOfWater);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	}
	
	public Shark(){
		this(34, waterType.saltWater, 0, "Shark" + counter, 3.45, 0.92);
		++counter;
	}
	
	public double getPredisposition(){
		boolean isTimeBetween11And6 = timeBetween11pmAnd6am();
		
		if(isTimeBetween11And6) 
			return 0.45;

		return 0;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.SHARK);
	}
}
