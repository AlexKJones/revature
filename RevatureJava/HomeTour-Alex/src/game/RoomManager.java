package game;

import Fixtures.Fixture;
import Fixtures.Room;

public class RoomManager {
	Room[] rooms = new Room[11];
	Room startingRoom;
	
	// setting up list of rooms
	//name, exit options w small description, long description, fixtures
	public void init() {
		Room lr = new Room(
			   "Living Room",
			   "left to pantry space,\nright to a bedroom,\nnorth to the backyard,\nor quit?",
			   "A nice 80s style sunken living room, complete with loungables and unfinished hobby tools.",
			   "Inspectable items: \n(just type in item to inspect)");
		Room br = new Room(
				"Bed Room",
				"left to living room, \nnorth to office, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room ps = new Room(
				"Open concept Pantry area",
				"right to living room, \nnorth to kitchen, \nsouth to dining room, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room dr = new Room(
				"Dining Room",
				"north to pantry space \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room ki = new Room(
				"Kitchen",
				"right to outside, \nnorth to snake room, \nsouth to pantry space, or \nquit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room sr = new Room(
				"Snake Room?",
				"north to garage, \nsouth kitchen, or \nquit?",
				"Beep",
				"Inspectable items:oneSnake, twoSnake, redSnake, blueSnake \\n(just type in item to inspect)");
		Room ga = new Room(
				"Garage",
				"south to snake room, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room ou = new Room(
				"Backyard",
				"left to kitchen, \nright to office, \nsouth to living room, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room of = new Room(
				"Office",
				"left to backyard, \nnorth to master bedroom, \nsouth to bedroom, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room mb = new Room(
				"Master BedRoom",
				"north to bathroom, \nsouth to office, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		Room ba = new Room(
				"Big Bathroom",
				"south to master bedroom, \nor quit?",
				"Beep",
				"Inspectable items: \\n(just type in item to inspect)");
		
		startingRoom = lr;
		
		// living room exits
		lr.setRightExit(br);
		lr.setLeftExit(ps);
		lr.setNorthExit(ou);
//		Fixture.couch();
//		Fixture.tv();
//		Fixture.aquarium();
//		Fixture.guitar();
		
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
//		Fixture.oneSnake();
//		Fixture.twoSnake();
//		Fixture.redSnake();
//		Fixture.blueSnake();
		
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
