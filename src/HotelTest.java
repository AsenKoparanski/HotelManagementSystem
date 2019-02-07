/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Calculating the max occupancy and testing that the Hotel system is working.
   Date: 15.12.2016
*/
public class HotelTest {
	public static void main(String args[]) {
		Hotel hotel = new Hotel();
		hotel.setName("The Hotel");
		hotel.setRooms(3);

		hotel.getRoom(0).setBedsNum(2);
		hotel.getRoom(0).setVacant(true);
		hotel.getRoom(0).getBed(0).setBedType(1);
		hotel.getRoom(0).getBed(1).setBedType(1);

		hotel.getRoom(1).setBedsNum(1);
		hotel.getRoom(1).setVacant(false);
		hotel.getRoom(1).getBed(0).setBedType(2);

		hotel.getRoom(2).setBedsNum(3);
		hotel.getRoom(2).setVacant(false);
		hotel.getRoom(2).getBed(0).setBedType(1);
		hotel.getRoom(2).getBed(1).setBedType(2);
		hotel.getRoom(2).getBed(2).setBedType(2);

		int occupancy = 0;
		for (int i = 0; i < hotel.getRoomsNum(); i++) {
			Room rm = hotel.getRoom(i);
			for (int j = 0; j < rm.getBedsNum(); j++) {
				Bed bed = rm.getBed(j);
				if (rm.getVacant() == true) {
					if (bed.getBedType().equals("Single")) {
						occupancy += 1;
						if (bed.getBedType().equals("Double")) {
							occupancy += 2;
						} // Calculates the max occupancy.
					}

				}

			}

		}
		System.out.println("Total Occupancy = " + occupancy);

	}
}
