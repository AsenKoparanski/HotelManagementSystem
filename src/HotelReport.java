/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Produces a textual report of all the added input.
   Date: 15.12.2016
*/
public class HotelReport {
	public void getHotelReport(Hotel hotel) {
		System.out.println("Hotel Name is : " + hotel.getName()); // Calls to the hotel to get the name
		System.out.println("Number of Rooms are : " + hotel.getRoomsNum()); // Calls to the hotel class to get the rooms.
		for (int i = 0; i < hotel.getRoomsNum(); i++) {

			Room rm = hotel.getRoom(i);
			System.out.println("*********");
			System.out.println("Room " + (i + 1) + " : ");
			System.out.println("Number of Beds  : " + rm.getBedsNum()); //Gets the amount of beds.
			System.out.println("Room is vacant  : " + rm.getVacant()); // Checks for if a room is vacant.

			for (int j = 0; j < rm.getBedsNum(); j++) {

				Bed bed = rm.getBed(j);
				System.out.println("Bed " + (j + 1) + " : ");
				System.out.println("Bed Size  : " + bed.getBedType()); // Gets the bed Type.
			}

		}

	}
}