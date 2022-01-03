package chapter6;

import java.text.NumberFormat;

public class CDCollection {
	private CD[] collection;
	private int count;
	private double totalCost;

//-----------------------------------------------------------------
// Creates an initially empty collection.
//-----------------------------------------------------------------
	public CDCollection() {
		collection = new CD[100];
		count = 0;
		totalCost = 0.0;
	}

//-----------------------------------------------------------------
// Adds a CD to the collection, increasing the size of the
// collection if necessary.
//-----------------------------------------------------------------
	public void addCD(String title, String artist, double cost, int tracks) {
		if (count == collection.length)
			increaseSize();
		collection[count] = new CD(title, artist, cost, tracks);
		totalCost += cost;
		count++;
	}

//-----------------------------------------------------------------
//Returns a report describing the CD collection.
//-----------------------------------------------------------------
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String report = "******************************************\n";
		report += "My CD Collection\n\n";
		report += "Number of CDs: " + count + "\n";
		report += "Total cost: " + fmt.format(totalCost) + "\n";
		report += "Average cost: " + fmt.format(totalCost / count);
		report += "\n\nCD List:\n\n";
		for (int cd = 0; cd < count; cd++)
			report += collection[cd].toString() + "\n";
		return report;
	}

//-----------------------------------------------------------------
//Doubles the size of the collection by creating a larger array
//and copying the existing collection into it.
//-----------------------------------------------------------------
	private void increaseSize() {
		CD[] temp = new CD[collection.length * 2];
		for (int cd = 0; cd < collection.length; cd++)
			temp[cd] = collection[cd];
		collection = temp;
	}

	public void sortTitle() {
		String min;
		int minI;
		for (int i = 0; i < count - 1; i++) {
			min = collection[i].getTitle();
			minI = i;
			for (int j = i + 1; j < count; j++) {
				if (collection[j].getTitle().compareTo(min) < 0) {
					min = collection[j].getTitle();
					minI = j;
				}

			}
			if (min.compareTo(collection[i].getTitle()) < 0) {
				CD temp = collection[minI];
				collection[minI] = collection[i];
				collection[i] = temp;
			}

		}
	}

	public void sortArtist() {
		String min;
		int minI;
		for (int i = 0; i < count - 1; i++) {
			min = collection[i].getArtist();
			minI = i;
			for (int j = i + 1; j < count; j++) {
				if (collection[j].getArtist().compareTo(min) < 0) {
					min = collection[j].getTitle();
					minI = j;
				}

			}
			if (min.compareTo(collection[i].getArtist()) < 0) {
				CD temp = collection[minI];
				collection[minI] = collection[i];
				collection[i] = temp;
			}

		}
	}

	public void sortPrice() {
		double min;
		int minI;
		for (int i = 0; i < count - 1; i++) {
			min = collection[i].getCost();
			minI = i;
			for (int j = i + 1; j < count; j++) {
				if (min > collection[j].getCost()) {
					min = collection[j].getCost();
					minI = j;
				}

			}
			if (min < collection[i].getCost()) {
				CD temp = collection[minI];
				collection[minI] = collection[i];
				collection[i] = temp;
			}

		}
	}

	public void sortTracks() {
		int min;
		int minI;
		for (int i = 0; i < count - 1; i++) {
			min = collection[i].getTracks();
			minI = i;
			for (int j = i + 1; j < count; j++) {
				if (min > collection[j].getTracks()) {
					min = collection[j].getTracks();
					minI = j;
				}

			}
			if (min < collection[i].getTracks()) {
				CD temp = collection[minI];
				collection[minI] = collection[i];
				collection[i] = temp;
			}

		}
	}
}