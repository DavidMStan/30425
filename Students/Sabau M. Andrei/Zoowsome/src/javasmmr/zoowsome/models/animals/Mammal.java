package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Mammal extends Animal{

	private float normalBodyTemp;
	private float percBodyHair;
	
	public void setNormalBodyTemp(float normalBodyTemp){
		this.normalBodyTemp = normalBodyTemp;
	}
	
	public float getNormalBodyTemp(){
		return this.normalBodyTemp;
	}
	
	public void setPercBodyHair(float percBodyHair){
		this.percBodyHair = percBodyHair;
	}
	
	public float getPercBodyHair(){
		return this.percBodyHair;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}
	
	public void decodeFromXml(Element element){
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
