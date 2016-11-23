package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal{

	private boolean canFly;
	private boolean isDangerous;
	
	public boolean getCanFly(){
		return this.canFly;
	}
	
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	
	public boolean getIsDangerous(){
		return this.isDangerous;
	}
	
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous = isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}
	
	public void decodeFromXml(Element element){
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
