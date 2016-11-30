package controllers;

import java.util.Arrays;

import utils.Constants;
import models.Creature;
import models.Guest;
import models.Host;

public class Westworld {

	public static void main(String[] args) {
		Creature host1 = new Host("HostName1", 20);
		Creature host2 = new Host("HostName2", 20);
		Creature guest1 = new Guest("GuestName1", 21);
		Creature guest2 = new Guest("GuestName2", 21);
		
		System.out.println(host1.toString());
		System.out.println(guest1.toString());

		host1.shoot(guest1);
		guest1.shoot(host1);
		
		System.out.println(host1.toString());
		System.out.println(guest1.toString());
		
		Creature[] creatures = {host2, host1, guest2, guest1};
		
		System.out.println("\n#######\nMy creatures array:");
		
		for (Creature creature: creatures) {
			System.out.println(creature.toString());
		}
		
		Arrays.sort(creatures);

		System.out.println("\n#######\nMy creatures array but sorted by name:");

		for (Creature creature: creatures) {
			System.out.println(creature.toString());
		}
		
		System.out.println("\nPrinting the names of hosts only:");

		for (Creature creature: creatures) {
			if (creature instanceof Host) {
				System.out.println(creature.toString());
			}
		}
		
		System.out.println("\nGetting some remarks");
		Host newHost = new Host();
		System.out.println(newHost.toString());
		System.out.println(newHost.getNextRemark());
		newHost.setMode(Constants.Creature.Host.ANALYSIS);
		System.out.println(newHost.getNextRemark());
		newHost.setMode(Constants.Creature.Host.NORMAL);
		System.out.println(newHost.getNextRemark());
	}

}
