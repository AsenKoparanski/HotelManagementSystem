/* Author: Asen Koparanski
   Student number: 160244340
   Purpose: Stores the number of beds in a room.
   Date: 15.12.2016
*/
public class Room {
	private boolean vacant;
	private Bed[] beds;
	private int beds_num;

	public void setBedsNum(int beds_num) { // Stores the amount of beds depending on the input.
		this.beds_num = beds_num;
		beds = new Bed[beds_num];
		for (int i = 0; i < beds_num; i++) {
			beds[i] = new Bed();
		}
	}

	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}

	public boolean getVacant() {
		return this.vacant;

	}

	public int getBedsNum() {
		return this.beds_num;

	}

	public Bed getBed(int i) {
		return this.beds[i];

	}

}
