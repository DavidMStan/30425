package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal{

	private boolean laysEggs;
	
	public boolean getLaysEggs(){
		return this.laysEggs;
	}
	
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}
	
	public void decodeFromXml(Element element){
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
