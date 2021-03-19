package game;

import Fixtures.Room;

// player just keeps track of current room
public class Player {
	Room currentRoom;
	public static //     0guitar,1key,2diamond,3wine, 4potato,5poster, 6 choppedpotato
	Boolean[] inventory = {false, false, false, false, false, false, false};
	
	public static Integer health = 10;
	public static Integer coolness = 5;
	public static Integer intelligence = 5;
	
	public static void inventoryCheck() {
		System.out.println("\n-Your inventory conatins: ");
		if (inventory[0].equals(true)) {
			System.out.println("Guitar. ");
		}
		if (inventory[1].equals(true)) {
			System.out.println("Snake Key. ");
		}
		if (inventory[2].equals(true)) {
			System.out.println("Giant Diamond. ");
		}
		if (inventory[3].equals(true)) {
			System.out.println("Wine. ");
		}
		if (inventory[4].equals(true)) {
			System.out.println("Potato. ");
		}
		if (inventory[5].equals(true)) {
			System.out.println("David Bowie Poster. \n");
		}
		if (inventory[6].equals(true)) {
			System.out.println("Chopped Potato. \n");
		}
		if (inventory[6].equals(false) && inventory[5].equals(false) && inventory[4].equals(false) && inventory[3].equals(false) && inventory[2].equals(false) && inventory[1].equals(false) && inventory[0].equals(false)) {
			System.out.println("Nothing. \n");
		}
	}
	
	public static void statCheck() {
		System.out.println("\n-Your current stats are: Health:" + health + " Coolness:" + coolness + " intelligence:" + intelligence);
	}
}
