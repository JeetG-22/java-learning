package chapter6;

public class HotelRunner {

	public static void main(String[] args) {
		Hotel h = new Hotel(10);
		for(int i = 0; i < 9; i++) {
			h.requestRoom("Jill");
		}
		h.requestRoom("Jack");
		h.requestRoom("Hames");
		Reservation r = new Reservation("Jill", 6);
		h.cancelAndReassign(r);
		for(int i = 0; i < h.getRooms().length; i++) {
			System.out.println(h.getRooms()[i]);
		}
		for(int i = 0; i < h.getWaitlist().size(); i++) {
			System.out.println(h.getWaitlist().get(i));
		}
		System.out.println(h.getWaitlist().size());

	}

}
