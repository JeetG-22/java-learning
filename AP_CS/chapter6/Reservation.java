package chapter6;

public class Reservation {
	private int number;
	private String name;
	
	public Reservation(String guestName, int num) {
		name = guestName;
		number = num;
	}
	public int getRoomNumber() {
		return number;
	}
	public String toString() {
		return "Room Number: " + number + "\tGuest Name: " + name;
	}
}
