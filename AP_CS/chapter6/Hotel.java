package chapter6;

import java.util.ArrayList;

public class Hotel {
	private Reservation room[];
	private ArrayList<String> waitlist;

	public Hotel(int rooms) {
		room = new Reservation[rooms];
		waitlist = new ArrayList<String>();
	}

	public Reservation requestRoom(String guestName) {
		for (int i = 0; i < room.length; i++) {
			if (room[i] == null) {
				Reservation r = new Reservation(guestName, i);
				room[i] = r;
				return r;
			}
		}
		waitlist.add(guestName);
		return null;
	}

	public ArrayList<String> getWaitlist() {
		return waitlist;
	}
	

	public Reservation[] getRooms() {
		return room;
	}

	public Reservation cancelAndReassign(Reservation res) {
		room[res.getRoomNumber()] = null;
		if (waitlist.size() != 0) {
			Reservation r = new Reservation(waitlist.get(0), res.getRoomNumber());
			room[res.getRoomNumber()] = r;
			waitlist.remove(0);
			return r;
		}
		return null;
	}
}
