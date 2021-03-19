package game;

import Fixtures.Room;

public class RoomManager {
	Room[] rooms = new Room[11];
	Room startingRoom;
	
	// setting up list of rooms
	//name, exit options w small description, long description, fixtures
	public void init() {
		Room lr = new Room(
			   "Living Room",
			   "*left to pantry space,\n*right to a bedroom,\n*north to the backyard,\n*or quit?",
			   "A nice 80s style sunken living room, complete with loungables and unfinished hobby tools.",
			   "\nInspectable items:*guitar *tv *aquarium *couch \n(just type in item to inspect, other commands: stats, inventory)");
		Room br = new Room(
				"Bed Room",
				"*left to living room, \n*north to office, \n*or quit?",
				"A nice cozy little bedroom with a bed and some fun decorations on it’s shelf’s.",
				"\nInspectable items:*bed *models *speaker *box \\n(just type in item to inspect, other commands: stats, inventory)");
		Room ps = new Room(
				"Open concept Pantry area",
				"*right to living room, \n*north to kitchen, \n*south to dining room, \n*or quit?",
				"An open concept pantry room with open racks containing boxs full of food and ingredients.",
				"\nInspectable items:*cereal *flour *woodSpoons \\n(just type in item to inspect, other commands: stats, inventory)");
		Room dr = new Room(
				"Dining Room",
				"*north to pantry space \n*or quit?",
				"A small space with a large very nice table and some very expensive barely used plates \nand silverware behind a glass container.",
				"\nInspectable items:*china *wine *light \\n(just type in item to inspect, other commands: stats, inventory)");
		Room ki = new Room(
				"Kitchen",
				"*right to outside, \n*north to snake room, \n*south to pantry space, or \n*quit?",
				"A small kitchen with an island in the middle containing plenty of supplies to cut, \nsauté, cook, or clean anything you could imagine.",
				"\nInspectable items:*knives *cups *pans \\n(just type in item to inspect, other commands: stats, inventory)");
		Room sr = new Room(
				"Snake Room?",
				"*north to garage, \n*south kitchen, or \n*quit?",
				"A room full of well, snakes, but they don’t seem to be interested in going anywhere, \nthey mainly seem to keep to themselves.",
				"\nInspectable items:*oneSnake *twoSnake *redSnake *blueSnake \\n(just type in item to inspect, other commands: stats, inventory)");
		Room ga = new Room(
				"Garage",
				"*south to snake room, \n*or quit?",
				"A one car garage with some exercise equipment and several other unfinished and barely \nstarted hobby supplies.",
				"\nInspectable items:*car *punchingBag *pile *bike \\n(just type in item to inspect, other commands: stats, inventory)");
		Room ou = new Room(
				"Backyard",
				"*left to kitchen, \n*right to office, \n*south to living room, \n*or quit?",
				"An open backyard space complete with all the grass you could eat.",
				"\nInspectable items:*grass *garden *table *swing \\n(just type in item to inspect, other commands: stats, inventory)");
		Room of = new Room(
				"Office",
				"*left to backyard, \n*north to master bedroom, \n*south to bedroom, \n*or quit?",
				"A nice office space with one large desk and many other devices used for office type activities.",
				"\nInspectable items:*computer *printer *papers \\n(just type in item to inspect, other commands: stats, inventory)");
		Room mb = new Room(
				"Master BedRoom",
				"*north to bathroom, \n*south to office, \n*or quit?",
				"A large master bedroom with a much larger bed and some cozy little lamps and wall decorations.",
				"\nInspectable items:*lamp *gunRack *crate \\n(just type in item to inspect, other commands: stats, inventory)");
		Room ba = new Room(
				"Big Bathroom",
				"*south to master bedroom, \n*or quit?",
				"A large bathroom with two closets and a bath. Reminds me of the old days.",
				"\nInspectable items:*toilet *shower *closetOne *closetTwo \\n(just type in item to inspect, other commands: stats, inventory)");
		
		startingRoom = lr;
		
		// living room exits
		lr.setRightExit(br);
		lr.setLeftExit(ps);
		lr.setNorthExit(ou);
		
		// bed room exits
		br.setLeftExit(lr);
		br.setNorthExit(of);
		
		// pantry space exits
		ps.setRightExit(lr);
		ps.setNorthExit(ki);
		ps.setSouthExit(dr);
		
		// Dining room exits
		dr.setNorthExit(ps);
		
		// kitchen exits
		ki.setRightExit(ou);
		ki.setNorthExit(sr);
		ki.setSouthExit(ps);
		
		// snake room exits
		sr.setNorthExit(ga);
		sr.setSouthExit(ki);
		
		// garage exits
		ga.setSouthExit(sr);
		
		// outside exits
		ou.setRightExit(of);
		ou.setLeftExit(ki);
		ou.setSouthExit(lr);
		
		// office exits
		of.setLeftExit(ou);
		of.setNorthExit(mb);
		of.setSouthExit(br);
		
		// Master bedroom exits
		mb.setNorthExit(ba);
		mb.setSouthExit(of);
		
		// bathroom exits
		ba.setSouthExit(mb);
		
		// assigning rooms to array
		rooms[0] = lr;
		rooms[1] = br;
		rooms[2] = ps;
		rooms[3] = dr;
		rooms[4] = ki;
		rooms[5] = sr;
		rooms[6] = ga;
		rooms[7] = ou;
		rooms[8] = of;
		rooms[9] = mb;
		rooms[10] = ba;
	}
}
