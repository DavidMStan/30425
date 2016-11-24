package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Iris extends Insect {
	public Iris(String name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setCanFly(canFly);
		this.setIsDangerous(isDangerous);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Iris(){
		this("Iris", 6, false, false, 0.1, 0.4);	
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.IRIS);
	}


}
