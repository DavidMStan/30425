package models;

public class Guest extends Creature {

	public Guest() {
		super();
	}
	
	public Guest(String name, int age) {
		super(name, age);
	}

	@Override
	protected void getShot() {
		System.out.println(super.getName() + " is invincible!");
	}
}
