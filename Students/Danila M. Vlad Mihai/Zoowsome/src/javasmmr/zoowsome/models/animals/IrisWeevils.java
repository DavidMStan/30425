package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class IrisWeevils extends Insect{
	public IrisWeevils(String name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);	
	}
	public IrisWeevils(){
		this("IrisWeevils", 4, true, false, 0.1, 0.2);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.IRIS_WEEVILS);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
