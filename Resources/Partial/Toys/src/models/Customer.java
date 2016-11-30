package models;

//Using singular for the name of class
public abstract class Customer implements Comparable<Customer> {

	private String name;
	private int age;
	private int budget;
	
	public Customer() {
		this("CustomerName", 15, 100);
	}
	
	public Customer(String name, int age, int budget) {
		this.name = name;
		this.age = age;
		this.budget = budget;
	}
	
	public void buy(Toy toy) {
		if (this.budget > toy.getPrice()) {
			System.out.println(this.toString() + " buys " + toy.toString());
			this.budget -= toy.getPrice();
			System.out.println(this.toString() + " bought " + toy.toString());
		}
		else {
			System.out.println(this.name + " has not enough money");
		}
	}
	
	@Override
	public int compareTo(Customer customer) {
		return this.budget - customer.getBudget();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.budget;
	}
}
