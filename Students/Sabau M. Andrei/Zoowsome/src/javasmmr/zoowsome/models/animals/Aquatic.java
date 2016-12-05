package javasmmr.zoowsome.models.animals;

import javax.xml.stream.*;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Aquatic extends Animal {

	private int avgSwimDepth;
	public enum waterType {saltWater, freshWater};
	waterType typeOfWater;
	
	public void setAvgSwimDepth(int avgSwimDepth){
		this.avgSwimDepth = avgSwimDepth;
	}
	
	public int getAvgSwimDepth(){
		return this.avgSwimDepth;
	}
	
	public void setWaterType(waterType typeOfWater){
		this.typeOfWater = typeOfWater;
	}
	
	public waterType getWaterType(){
		return this.typeOfWater;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(this.typeOfWater));
	}
	
	public void decodeFromXml(Element element){
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		//this.typeOfWater = waterType.valueOf(element.getElementsByTagName("typeOfWater").item(0).getTextContent());
	}
}
