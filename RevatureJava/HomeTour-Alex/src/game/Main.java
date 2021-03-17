package game;

import java.util.Scanner;

import Fixtures.Room;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// set up game
		RoomManager rm = new RoomManager();
		rm.init();
		Player p1 = new Player();
		p1.currentRoom = rm.startingRoom;
		
		System.out.println("Welcome to my home!");
		String userInput = "";
		
		while(!userInput.equals("quit")) {
			System.out.println(p1.currentRoom.name);
			System.out.println(p1.currentRoom.longo);
			System.out.println(p1.currentRoom.fixt);
			System.out.println(p1.currentRoom.options);
			userInput = scan.next();
			Room room = p1.currentRoom.getExit(userInput);
			if(room != null) {
				p1.currentRoom = room;
			}else {
				System.out.println("Command not understood");
			}
		}
		scan.close();
	}
}
