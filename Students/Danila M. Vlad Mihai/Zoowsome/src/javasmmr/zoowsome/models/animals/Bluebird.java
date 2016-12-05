package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Bluebird extends Bird {
	public Bluebird(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc ){
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setMigrates(migrates);
		this.setAvgFlightAltitude(avgFlightAltitude);
		this.setNrOfLegs(nrOfLegs);	
	}
	public Bluebird(){
		this("BlueBird", 2, false, 129, 1.3, 0.3);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.BLUEBIRD);
		}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}

}
