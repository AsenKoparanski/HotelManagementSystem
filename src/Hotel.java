/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Stores the information about the hotel and rooms.
   Date: 15.12.2016
*/
public class Hotel {
	private String name;
	private Room[] rooms;
	private int rooms_num;

	public void setRooms(int rooms_num) { // Stores the values of the rooms depending on the input
		this.rooms_num = rooms_num;
		rooms = new Room[rooms_num];
		for (int i = 0; i < rooms_num; i++) {
			rooms[i] = new Room();
		}
	}

	public int getRoomsNum() {
		return this.rooms_num;

	}

	public Room getRoom(int i) {
		return this.rooms[i];

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;

	}

}
