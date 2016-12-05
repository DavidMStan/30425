package javasmmr.zoowsome.repositories;

import javax.xml.stream.events.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.parsers.*;
import javax.xml.stream.*;
import java.util.ArrayList;
import org.xml.sax.SAXException;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
		 		
		 		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance(); 
		 		
		 		// create XMLEventWriter
		 		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		 		
		 		//create an EventFactory
		 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		 		XMLEvent end = eventFactory.createDTD("\n");
		 		
		 		//create and write Start Tag
		 		StartDocument startDocument = eventFactory.createStartDocument();
		 		eventWriter.add(startDocument);
		 		
		 		//Create content Open Tag
		 		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		 		eventWriter.add(configStartElement);
		 		eventWriter.add(end);
		 		
		 		for(XML_Parsable animal: animals){
		 			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
		 			eventWriter.add(sElement);
		 			eventWriter.add(end);
		 			
		 			animal.encodeToXml(eventWriter);
		 			
		 			EndElement eElement = eventFactory.createEndElement("", "" , Constants.XML_TAGS.ANIMAL);
		 			eventWriter.add(eElement);
					eventWriter.add(end);
		 		}
				
		 		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		 		eventWriter.add(eventFactory.createEndDocument());
		 		eventWriter.close();
		 		
	}
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException{
		 		ArrayList<Animal> animals = new ArrayList<Animal>();
		 		
		 		File fXmlFile = new File(XML_FILENAME);
		 		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		 		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		 		Document doc = dBuilder.parse(fXmlFile);
		 		doc.getDocumentElement().normalize();
		 		
		 		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		 		
		 		for(int i = 0; i < nodeList.getLength(); i++){
		 			Node node = nodeList.item(i);
		 			
		 			if(node.getNodeType() == Node.ELEMENT_NODE){
		 				Element element = (Element) node;
		 				
		 				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		 		
		 				switch(discriminant){
		 				case Constants.Animals.Insects.IRIS: 
		 					Animal iris = new Iris();
		 					iris.decodeFromXml(element);
		 					animals.add(iris);
		 					break;
		 				case Constants.Animals.Insects.IRIS_BORERS:
		 					Animal irisBorers = new IrisBorers();
		 					irisBorers.decodeFromXml(element);
		 					animals.add(irisBorers);
		 					break;
		 				case Constants.Animals.Insects.IRIS_WEEVILS:
		 					Animal irisWeevils = new IrisWeevils();
		 					irisWeevils.decodeFromXml(element);
		 					animals.add(irisWeevils);
		 					break;
		 				case Constants.Animals.Mammals.MOUNTAIN_GOAT:
		 					Animal mountainGoat= new MountainGoat();
		 					mountainGoat.decodeFromXml(element);
		 					animals.add(mountainGoat);
		 					break;
		 				case Constants.Animals.Mammals.MOUNTAIN_GORILLA:
		 					Animal mountainGorilla = new MountainGorilla();
		 					mountainGorilla.decodeFromXml(element);
		 					animals.add(mountainGorilla);
		 					break;
		 				case Constants.Animals.Mammals.MOUNTAIN_LION:
		 				Animal mountainLion = new MountainLion();
		 				mountainLion.decodeFromXml(element);
		 					animals.add(mountainLion);
		 					break;
		 				case Constants.Animals.Reptiles.RETICULATE_LIZARD:
		 					Animal reticulateLizard = new ReticulateLizard();
		 					reticulateLizard.decodeFromXml(element);
		 					animals.add(reticulateLizard);
		 					break;
		 				case Constants.Animals.Reptiles.RIDGEHEAD_SNAKE:
		 					Animal ridgeheadSnake = new RidgeheadSnake();
		 					ridgeheadSnake.decodeFromXml(element);
		 					animals.add(ridgeheadSnake);
		 					break;
		 				case Constants.Animals.Reptiles.RUSSIAN_VIPER:
		 					Animal russianViper = new RussianViper();
		 					russianViper.decodeFromXml(element);
		 					animals.add(russianViper);
		 					break;
		 				case Constants.Animals.Birds.BLACKBIRD:
		 					Animal blackBird = new Blackbird();
		 					blackBird.decodeFromXml(element);
		 					animals.add(blackBird);
		 					break;
		 				case Constants.Animals.Birds.BLUEBIRD:
		 					Animal bluebird = new Bluebird();
		 					bluebird.decodeFromXml(element);
		 					animals.add(bluebird);
		 					break;
		 				case Constants.Animals.Birds.BROOD:
		 					Animal brood = new Brood();
		 					brood.decodeFromXml(element);
		 					animals.add(brood);
		 					break;
		 				case Constants.Animals.Aquatics.ANGEL_FISH:
		 					Animal angelFish = new Angelfish();
		 					angelFish.decodeFromXml(element);
		 					animals.add(angelFish);
		 					break;
		 				case Constants.Animals.Aquatics.ANGEL_SHARK:
		 					Animal angelShark = new Angelshark();
		 					angelShark.decodeFromXml(element);
		 					animals.add(angelShark);
		 					break;
		 				case Constants.Animals.Aquatics.ANGLER_FISH:
		 					Animal anglerFish = new Anglerfish();
		 					anglerFish.decodeFromXml(element);
		 					animals.add(anglerFish);
		 					break;

		 				default: 
		 					break;
		 			}
		 			}
		 		}
		 
		 		return animals;
		 	}

public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException{
	 		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	 		XMLEvent end = eventFactory.createDTD("\n");
	 		XMLEvent tab = eventFactory.createDTD("\t");
	 		
	 		//create start node
	 		StartElement sElement = eventFactory.createStartElement("", "", name);
	 		
	 		eventWriter.add(tab);
	 		eventWriter.add(sElement);
	 		
	 		//create content
	 		Characters characters = eventFactory.createCharacters(value);
	 		
	 		eventWriter.add(characters);
	 		
	 		//create end node
	 		EndElement eElement = eventFactory.createEndElement("", "", name);
	 		
	 		eventWriter.add(eElement);
	 		eventWriter.add(end);
	}
}

