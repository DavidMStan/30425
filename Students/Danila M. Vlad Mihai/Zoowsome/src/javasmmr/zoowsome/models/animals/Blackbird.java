package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Blackbird extends Bird {
		public Blackbird(String name, int nrOfLegs, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
			super(maintenanceCost, dangerPerc);
			this.setName(name);
			this.setMigrates(migrates);
			this.setAvgFlightAltitude(avgFlightAltitude);
			this.setNrOfLegs(nrOfLegs);	
		}
		public Blackbird(){
			this("BlackBird", 2, false, 312, 0.9, 0.3);
		}
		@Override
		public void decodeFromXml(Element element) {
			// TODO Auto-generated method stub
			
		}
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.BLACKBIRD);
			}

}
