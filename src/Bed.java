/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Stores the size of the beds.
   Date: 15.12.2016
*/
public class Bed {
	private int bedType;

	public void setBedType(int bedType) {
		this.bedType = bedType;

	}

	public String getBedType() { // Declare the bed sizes 
		if (bedType == 1) {
			return "Single";

		} else {
			return "Double";
		}
	}

}
