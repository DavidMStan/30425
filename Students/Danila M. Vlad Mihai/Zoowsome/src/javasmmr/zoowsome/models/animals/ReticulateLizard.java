package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class ReticulateLizard extends Reptile{
	public ReticulateLizard( String name, int nrOfLegs, boolean laysEggs, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	public ReticulateLizard(){
		this("ReticulateLizard", 4, true, 2.3, 0.9);
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.RETICULATE_LIZARD);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
