package models;

public abstract class Creature implements Comparable<Creature> {

	private String name;
	private int age;
	private boolean dead;
	
	public Creature() {
		this("Creature", 20);
	}
	
	public Creature(String name, int age) {
		this.name = name;
		this.age = age;
		this.dead = false;
	}
	
	@Override
	public int compareTo(Creature creature) {
		return this.name.compareTo(creature.getName());
	}
	
	public void shoot(Creature creature) {
		creature.getShot();
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

	public boolean isDead() {
		return dead;
	}
	
	protected void getShot() {
		System.out.println(this.name + " got shot!");
		this.dead = true;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.dead;
	}
}
