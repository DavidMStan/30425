package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

public abstract class Bird extends Animal{

	private boolean migrates;
	private int avgFlightAltitude;
	
	public boolean getMigrates(){
		return this.migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude(){
		return this.avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude = avgFlightAltitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
	}
	
	public void decodeFromXml(Element element){
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
