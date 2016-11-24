package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Angelfish extends Aquatic {
	public Angelfish(String name, int nrOfLegs, int avgSwimDepth, Enum waterType, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Angelfish(){
		this("Angelfish" , 0, 67, Enum.SALTWATER, 0.4, 0.1);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.ANGEL_FISH);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
