
/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Provides user interface that prints out the input of the Hotel information.
   Date: 15.12.2016
*/

import java.util.Scanner;

public class HotelConfigure {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Hotel hotel = new Hotel(); // Create a hotel object.
		hotel.setName("The Hotel");
		System.out.println("Please Enter Number of Rooms : ");
		int rooms = sc.nextInt();

		while (rooms < 1) {
			System.out.println("Invalid room number, try again with a positive value:");
			rooms = sc.nextInt(); // Preventing the user from entering invalid
									// values
		}

		hotel.setRooms(rooms);

		for (int i = 0; i < rooms; i++) {

			System.out.println();
			System.out.println();
			System.out.println("Room" + (i + 1) + " : ");
			Room rm = hotel.getRoom(i);
			System.out.println("Please Enter Number of beds : ");
			int beds = sc.nextInt();

			while (beds < 1) {
				System.out.println("Invalid bed number, try again with a positive value:");
				beds = sc.nextInt(); // Preventing the user from entering
										// invalid values.
			}
			System.out.println("Is room vacant, type true or false :  ");

			String vacant = sc.next();
			sc.nextLine();

			while ((!vacant.equals("true")) && (!vacant.equals("false"))) {
				System.out.println("Invalid vacancy type, try again with true or false:");
				vacant = sc.nextLine(); // Preventing the user from entering
										// invalid values.

			}
			Boolean vBoolean = Boolean.parseBoolean(vacant); 
			hotel.getRoom(i).setVacant(vBoolean); // Calls the vacant method.
			hotel.getRoom(i).setBedsNum(beds); 

			for (int j = 0; j < hotel.getRoom(i).getBedsNum(); j++) {

				System.out.println();
				Bed bed = hotel.getRoom(i).getBed(j);
				System.out.println("Bed " + (j + 1) + " : ");
				System.out.println("Please Enter Bed Size as 1 for single or 2 for double  : ");
				int bedType = sc.nextInt();
				while (bedType != 1 && bedType != 2) {
					System.out.println("Invalid bed type, try again with 1 or 2:");
					bedType = sc.nextInt(); // Preventing the user from entering
											// invalid values.
				}
				hotel.getRoom(i).getBed(j).setBedType(bedType); // Sets the
																// values of the
																// rooms, beds
																// and bed type

			}
        sc.close();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		HotelReport hotelReport = new HotelReport();  
		hotelReport.getHotelReport(hotel);          // Prints out the set values.

	}
}
