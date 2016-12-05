package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.animals.Aquatic.Enum;
import javasmmr.zoowsome.services.factories.Constants;

public class Angelshark extends Aquatic {
	public Angelshark(String name, int nrOfLegs, int avgSwimDepth, Enum waterType, double maintenanceCost, double dangerPerc ){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Angelshark(){
		this("Angelshark", 0, 77, Enum.SALTWATER, 0.7, 0.9);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.ANGEL_SHARK);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
