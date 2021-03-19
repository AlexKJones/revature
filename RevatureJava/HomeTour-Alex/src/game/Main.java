package game;

import java.util.Scanner;

import Fixtures.Fixture;
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
			if (Player.health.equals(0)) {
				System.out.println("You have run out of health and blacked out.");
				scan.close();
				break;
			} else 
			System.out.println(p1.currentRoom.name);
			System.out.println(p1.currentRoom.longo);
			System.out.println(p1.currentRoom.fixt);
			System.out.println(p1.currentRoom.options);
			userInput = scan.next();
			if (userInput.equals("left") || userInput.equals("right") || userInput.equals("north") || userInput.equals("south")) {
			Room room = p1.currentRoom.getExit(userInput);
			if(room != null) {
				p1.currentRoom = room;
			}
			} else if (p1.currentRoom.name.equals("Living Room")) {
				// living room fixtures
				if (userInput.equals("couch")) {
					Fixture.couch();
				}
				if (userInput.equals("tv")) {
					Fixture.tv();
				}
				if (userInput.equals("aquarium")) {
					Fixture.aquarium();
				}
				if (userInput.equals("guitar")) {
					Fixture.guitar();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
			} else if (p1.currentRoom.name.equals("Snake Room?")) {
				// snake room fixtures
				if (userInput.equals("oneSnake")) {
					Fixture.oneSnake();
				}
				if (userInput.equals("twoSnake")) {
					Fixture.twoSnake();
				}
				if (userInput.equals("redSnake")) {
					Fixture.redSnake();
				}
				if (userInput.equals("blueSnake")) {
					Fixture.blueSnake();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
			}
			else if (p1.currentRoom.name.equals("Bed Room")) {
				// snake room fixtures
				if (userInput.equals("bed")) {
					Fixture.bed();
				}
				if (userInput.equals("models")) {
					Fixture.models();
				}
				if (userInput.equals("speaker")) {
					Fixture.speaker();
				}
				if (userInput.equals("box")) {
					Fixture.box();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Open concept Pantry area")) {
				// snake room fixtures
				if (userInput.equals("cereal")) {
					Fixture.cereal();
				}
				if (userInput.equals("flour")) {
					Fixture.flour();
				}
				if (userInput.equals("woodSpoons")) {
					Fixture.woodSpoons();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Dining Room")) {
				// snake room fixtures
				if (userInput.equals("china")) {
					Fixture.china();
				}
				if (userInput.equals("wine")) {
					Fixture.wine();
				}
				if (userInput.equals("light")) {
					Fixture.light();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Kitchen")) {
				// snake room fixtures
				if (userInput.equals("knives")) {
					Fixture.knives();
				}
				if (userInput.equals("cups")) {
					Fixture.cups();
				}
				if (userInput.equals("pans")) {
					Fixture.pans();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Garage")) {
				// snake room fixtures
				if (userInput.equals("car")) {
					Fixture.car();
				}
				if (userInput.equals("punchingBag")) {
					Fixture.punchingBag();
				}
				if (userInput.equals("pile")) {
					Fixture.pile();
				}
				if (userInput.equals("bike")) {
					Fixture.bike();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Backyard")) {
				// snake room fixtures
				if (userInput.equals("grass")) {
					Fixture.grass();
				}
				if (userInput.equals("garden")) {
					Fixture.garden();
				}
				if (userInput.equals("table")) {
					Fixture.table();
				}
				if (userInput.equals("swing")) {
					Fixture.swing();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Office")) {
				// snake room fixtures
				if (userInput.equals("computer")) {
					Fixture.computer();
				}
				if (userInput.equals("printer")) {
					Fixture.printer();
				}
				if (userInput.equals("papers")) {
					Fixture.papers();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Master BedRoom")) {
				// snake room fixtures
				if (userInput.equals("lamp")) {
					Fixture.lamp();
				}
				if (userInput.equals("gunRack")) {
					Fixture.gunRack();
				}
				if (userInput.equals("crate")) {
					Fixture.crate();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
				
				
			}
			else if (p1.currentRoom.name.equals("Big Bathroom")) {
				// snake room fixtures
				if (userInput.equals("toilet")) {
					Fixture.toilet();
				}
				if (userInput.equals("shower")) {
					Fixture.shower();
				}
				if (userInput.equals("closetOne")) {
					Fixture.closetOne();
				}
				if (userInput.equals("closetTwo")) {
					Fixture.closetTwo();
				}
				if (userInput.equals("inventory")) {
					Player.inventoryCheck();
				}
				if (userInput.equals("stats")) {
					Player.statCheck();
				}
			} 
	} 
		scan.close();
	}
}
