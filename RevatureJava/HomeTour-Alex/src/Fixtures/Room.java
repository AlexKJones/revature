package Fixtures;

public class Room extends Fixture{
	Room[] exits = new Room[4];
	//{0:left, 1:right, 2:north, 3:south}
	public String options;
	public String longo;
	public String fixt;
	
	public Room(String name, String options, String longo, String fixt) {
		this.name=name;
		this.options=options;
		this.longo=longo;
		this.fixt=fixt;
	}
	
	public void setLeftExit(Room exit) {
		this.exits[0] = exit;
	}
	
	public void setRightExit(Room exit) {
		this.exits[1] = exit;
	}
	
	public void setNorthExit(Room exit) {
		this.exits[2] = exit;
	}
	
	public void setSouthExit(Room exit) {
		this.exits[3] = exit;
	}
	
	public Room getExit(String direction) {
		if(direction.equals("left")) {
			return exits[0];
		}else if(direction.equals("right")) {
			return exits[1];
		}
		else if(direction.equals("north")) {
			return exits[2];
		}else {
			return exits[3];
		}
		
	}
}
