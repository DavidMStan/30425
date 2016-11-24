package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class MountainGorilla extends Mammal{
	public MountainGorilla(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNormalBodyTemp(normalBodyTemp);
		this.setPercBodyHair(percBodyHair);
		this.setNrOfLegs(nrOfLegs);	
	}
	public MountainGorilla(){

		this("MountainGorilla", 4, (float)37.12, (float)94.21, 6.1, 0.6);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.MOUNTAIN_GORILLA);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
