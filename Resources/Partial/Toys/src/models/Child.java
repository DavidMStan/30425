package models;

import utils.Constants;

// Using singular for the name of class
public class Child extends Customer {

	public Child() {
		super();
	}
	
	public Child(String name, int age, int budget) {
		super(name, age, budget);
	}

	@Override
	public void buy(Toy toy) {
		if (this.getAge() < Constants.Customer.MINIMUM_BUYER_AGE) {
			System.out.println(super.getName() + " is too young to buy toys");
		}
		else {
			super.buy(toy);
		}
	}
}
