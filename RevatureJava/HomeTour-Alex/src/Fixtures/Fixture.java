package Fixtures;

public class Fixture {
	//TODO: encapsulate, add description and getters and setters
	public String name;
	public String options;
	
	// Living Room fixtures
	public static void couch() {
		System.out.println("You take a load off for a moment, feels nice.");
	}
	
	public static void tv() {
		System.out.println("You turn on the tv.  You lost 1 Int");
		// player Int -1
	}
	
	public static void aquarium() {
		System.out.println("You smile and wave at the fish. \nThey smile and wave back."
				+ " \nMaybe we leave the fish alone.");
	}
	
	public static void guitar() {
		System.out.println("You pick up and strum the guitar, Nice! \nGuitar added to inventory");
		// player inventory +guitar
	}
	
	// Snake Room fixtures
	public static void oneSnake() {
		System.out.println("You pet the snake, He does you a hiss.");
	}
	
	public static void twoSnake() {
		System.out.println("You pet the snakes, They do you a hiss.");
	}
	
	public static void redSnake() {
		System.out.println("You pet the snake, He does you a BITE!");
		// player health -1
	}
	
	public static void blueSnake() {
		System.out.println("You pet the snake, the snake is a toy. \nYou add toy snake to your inventory");
		// player inventory +toySnake
	}
}
