package models;

import utils.Constants;
import utils.Generator;

//Using singular for the name of class
public class Toy {

	private int price;
	private String type;
	private String guid;

	public Toy() {
		this(50, Constants.Toy.CAR);
	}

	public Toy(int price, String type) {
		this.price = price;
		this.type = type;
		this.guid = Generator.generateGuid();
	}

	public String getDetails() {
		if (this.type.equals(Constants.Toy.CAR)) {
			return this.guid;		
		} else if (this.type.equals(Constants.Toy.DOLL)) {
			return this.toString();
		} else if (this.type.equals(Constants.Toy.EDUCATIONAL)) {
			return String.valueOf(this.price);
		}
		return "No details for " + this.type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	@Override
	public String toString() {
		return this.guid + " " + this.price + " " + this.type;
	}
}
