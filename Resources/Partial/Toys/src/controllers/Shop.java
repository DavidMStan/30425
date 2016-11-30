package controllers;

import java.util.Arrays;

import utils.Constants;
import models.Adult;
import models.Child;
import models.Customer;
import models.Toy;

public class Shop {

	public static void main(String[] args) {
		// Using plural for the name of an array of objects
		Toy[] toys = {
				new Toy(10, Constants.Toy.CAR),
				new Toy(30, Constants.Toy.DOLL),
				new Toy(40, Constants.Toy.EDUCATIONAL),
		};
		
		Customer[] customers = {
			new Child("Child1", 10, 600),
			new Child("Child2", 14, 500),
			new Child("Child3", 17, 400),
			new Adult("Adult1", 23, 300),
			new Adult("Adult2", 40, 200)
		};
		
		System.out.println("My array of customers:");
		System.out.println("name  age budget");
		for(Customer customer : customers) {
			System.out.println(customer.toString());
		}
		
		Arrays.sort(customers);
		
		System.out.println("Same array of customers but sorted by their budget:");
		System.out.println("name  age budget");
		for(Customer customer : customers) {
			System.out.println(customer.toString());
		}
		
		System.out.println("Printing the names of children only:");
		for(Customer customer : customers) {
			if (customer instanceof Child) {
				System.out.println(customer.getName());
			}
		}
		
		System.out.println("My array of toys:");
		for (Toy toy : toys) {
			System.out.println(toy.toString());
		}
		
		customers[0].buy(toys[0]);
		customers[0].buy(toys[1]);
		customers[0].buy(toys[2]);
		customers[3].buy(toys[2]);
		customers[4].buy(toys[2]);
	}
}
