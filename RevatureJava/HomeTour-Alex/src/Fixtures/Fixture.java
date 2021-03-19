package Fixtures;

import game.Player;

public class Fixture {
	//TODO: encapsulate, add description and getters and setters
	public String name;
	public String options;
	
	// Living Room fixtures
	public static void couch() {
		System.out.println("\n-You take a load off for a moment, feels nice.\n");
	}
	
	public static void tv() {
		System.out.println("\n-You turn on the tv.  You lost 1 Int\n");
		Player.intelligence--;
	}
	
	public static void aquarium() {
		System.out.println("\n-You smile and wave at the fish. \n-They smile and wave back."
				+ " \n-Maybe we leave the fish alone.\n");
	}
	
	public static void guitar() {
		System.out.println("\n-You pick up and strum the guitar, Nice! \n-Guitar added to inventory\n");
		Player.inventory[0] = true;
	}
	
	// Snake Room fixtures
	public static void oneSnake() {
		System.out.println("\n-You pet the snake, He does you a hiss.\n");
	}
	
	public static void twoSnake() {
		System.out.println("\n-You pet the snakes, They do you a hiss.\n");
	}
	
	public static void redSnake() {
		System.out.println("\n-You pet the snake, He does you a BITE! \n-You lose 1 health.\n");
		Player.health--;
	}
	
	public static void blueSnake() {
		System.out.println("\n-You pet the snake, the snake is a toy. \n-There is a key hidden below it. \n-Key added to inventory.\n");
		Player.inventory[1] = true;
	}
	
	// bed Room fixtures
		public static void bed() {
			System.out.println("\n-You lay onto the bed, feels refreshing.\n");
			Player.health++;
		}
		
		public static void models() {
			System.out.println("\n-You admire the models on display. \n-You touch one of the cooler looking ones and it falls \n-probably no one will notice.\n");
		}
		
		public static void speaker() {
			System.out.println("\n-You turn on the speaker. \n-It sounds like rain falling\n");
		}
		
		public static void box() {
			System.out.println("\n-You see a small box, but it is locked tight\n");
			if (Player.inventory[1].equals(true)){
				Player.inventory[2] = true;
				System.out.println("-You open it with the snake key. \n-Giant Diamond added to inventory.\n");
			}
		}
		
		// pantry Room fixtures
		public static void cereal() {
			System.out.println("\n-Ooh now only 8 times the daily amount of sugar!\n");
		}
		
		public static void flour() {
			System.out.println("\n-Wow fresh baked cookies sounnds great right now.\n");
		}
		
		public static void woodSpoons() {
			System.out.println("\n-You play the raddest wood spoon drum solo the world has ever heard! \n-Too bad the world missed it. \n-Coolness increased!\n");
			Player.coolness++;
		}
		
		// Dining Room fixtures
		public static void china() {
			System.out.println("\n-Wow these are some real nice plates, that get used once a year.\n");
		}
		
		public static void wine() {
			System.out.println("\n-You walk up to the large wine rack. \n-I'm sure no one will notice. \n-Wine added to inventory\n");
			Player.inventory[3] = true;
			Player.coolness--;
		}
		
		public static void light() {
			System.out.println("\n-There is a lovely chandeluer above the table, must set a lovely mood.\n");
		}
		
		// Kitchen Room fixtures
		public static void knives() {
			if (Player.inventory[4].equals(true)) {
				Player.inventory[4] = false;
				System.out.println("You chop up the potato.");
			} else {
				System.out.println("\n-These seem oddly within reach of children.\n");
			}
			
		}
		
		public static void cups() {
			System.out.println("\n-You open the cup cabinet. \n-Is this a collection of seven eleven slurpee cups?\n");
		}
		
		public static void pans() {
			if (Player.inventory[6].equals(true) && Player.inventory[3].equals(true)) {
				Player.inventory[3] = false;
				Player.inventory[6] = false;
				Player.health = Player.health + 5;
				System.out.println("You cook the chopped potato and enjoy some wine. \n+5 health.");
			} else if (Player.inventory[6].equals(true)) {
				System.out.println("If only I had some wine...");
			} else {
				System.out.println("\n-I could make a sweet drumset with these.\n");
			}
		}
		
		// Garage fixtures
		public static void car() {
			System.out.println("\n-A Tesla Cybertruck!? I didn't know these were even out yet.\n");
		}
		
		public static void punchingBag() {
			System.out.println("\n-You punch the bag. \n-Your hand hurts more than you'd like to admit. \n-1 cool\n");
			Player.coolness--;
		}
		
		public static void pile() {
			System.out.println("\n-You look at the pile of 'Stuff'. \n-What is any of this for??\n");
		}
		
		public static void bike() {
			System.out.println("\n-The bike practically creaks just from being looked at. \n-This thing really needs a tune up.\n");
		}
		
		// Outside fixtures
		public static void grass() {
			System.out.println("\n-It does look oddly appetizing...\n");
		}
		
		public static void garden() {
			System.out.println("\n-What a lovely little garden. \n-Potato added to inventory\n");
			Player.inventory[4] = true;
			Player.coolness--;
		}
		
		public static void table() {
			System.out.println("\n-You look at the table and think of how fun it would be to have a bbq with all your friends here.\n");
		}
		
		public static void swing() {
			System.out.println("\n-You sit in the swing and waste an oddly long amount of time.\n");
		}
		
		// Office fixtures
		public static void computer() {
			System.out.println("\n-Woah dude, you're looking at a computer while looking at a computer. Woooaaah.\n");
		}
		
		public static void printer() {
			System.out.println("\n-Probably out of ink.\n");
		}
		
		public static void papers() {
			System.out.println("\n-There is a collection of different types of paper.\n");
		}
		
		// MasterBed fixtures
		public static void lamp() {
			System.out.println("\n-You turn on the lamp. \n-Ah if only I had a nice book around.\n");
		}
		
		public static void gunRack() {
			System.out.println("\n-There is a gunrack loaded with Nerf Guns. \n-This houseowner is awesome.\n");
		}
		
		public static void crate() {
			System.out.println("\n-There is a large crate full of dog treats. \n-This owner really loves their dogs\n");
		}
		
		// Bathroom fixtures
		public static void toilet() {
			System.out.println("\n-You feel much better now.\n");
		}
		
		public static void shower() {
			System.out.println("\n-You step into the shower. \n-Probably a weird time to bathe.\n");
		}
		
		public static void closetOne() {
			System.out.println("\n-It's full of shirts and pants. \n-You find something behind the hanging shirts. \n-David Bowie Poster added to inventory\n");
			Player.inventory[5] = true; 
			Player.coolness++;
		}
		
		public static void closetTwo() {
			System.out.println("\n-It is full to the brim with boxes of puzzles. \n-How much free time does this guy have?\n");
		}
		
}
