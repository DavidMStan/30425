package models;

import java.util.UUID;

import utils.Constants;

public class Host extends Creature {

	private String mode = Constants.Creature.Host.SHUTDOWN;
	private String guid = UUID.randomUUID().toString();

	public Host() {
		super();
	}

	public Host(String name, int age) {
		super(name, age);
	}

	public String getNextRemark() {
		switch (this.getMode()) {
			case Constants.Creature.Host.NORMAL:
				return this.toString();
			case Constants.Creature.Host.ANALYSIS:
				return this.getGuid();
			default:
				return "Shutdown!";
		}
	}
	
	public String getGuid() {
		return this.guid;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
