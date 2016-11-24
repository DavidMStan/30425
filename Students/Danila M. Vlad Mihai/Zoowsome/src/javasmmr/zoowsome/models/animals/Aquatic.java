package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private int avgSwimDepth;
	public enum Enum{
		SALTWATER, FRESHWATER
	}
	private Enum waterType;
	
	public Aquatic(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}
	 public int getAvgSwimDepth(){
		 return avgSwimDepth;
	 }
	 public void setAvgSwimDepth(int avgSwimDepth){
		 this.avgSwimDepth = avgSwimDepth;
		 
	 }
	 public Enum getWaterType(){
		 return waterType;
	 }
	 public void setWaterType(Enum waterType){
		 this.waterType = waterType;
	 }
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		 super.encodeToXml(eventWriter);
		 createNode(eventWriter, "AvgSwimDepth", String.valueOf(getAvgSwimDepth()));
		 createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		 }
	 public void decodeFromXml(Element element){
		 setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		 setWaterType(Enum.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}


}
