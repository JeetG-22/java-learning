package chapter6;

import java.util.Scanner;

public class Tunes {
//-----------------------------------------------------------------
// Creates a CDCollection object and adds some CDs to it. Prints
// reports on the status of the collection.
//-----------------------------------------------------------------
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		// Init Music Object
		CDCollection music = new CDCollection();
		music.addCD("Storm Front", "Billy Joel", 14.95, 10);
		music.addCD("Come On Over", "Shania Twain", 14.95, 16);
		music.addCD("Soundtrack", "Les Miserables", 17.95, 33);
		music.addCD("Graceland", "Paul Simon", 13.90, 11);
		music.addCD("Double Live", "Garth Brooks", 19.99, 26);
		music.addCD("Greatest Hits", "Jimmy Buffet", 15.95, 13);
		System.out.println("Original:\n" + music);
		int sentinel = 0;
		String option = "How would you like to sort this collection of CDs by?\n";
		option += "1. Title\n2. Price\n3. Number of Tracks\n4. Artist";

		while (sentinel != 1) {
			System.out.println(option);
			int userInput = kbd.nextInt();

			switch (userInput) {
			case 1:
				music.sortTitle();
				break;
			case 2:
				music.sortPrice();
				break;
			case 3:
				music.sortTracks();
				break;
			case 4:
				music.sortArtist();
				break;
			default:
				System.out.println("Error! Bad Input.");
			}
			System.out.println(music);

			System.out.println("1. Exit  2. Continue");
			sentinel = kbd.nextInt();
		}
		kbd.close();
	}
}