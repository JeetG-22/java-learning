package midterms.first;

public class LinkedList {

	private class Node {
		private int item;
		private Node next;
	}

	static Node first; // points to the first node of the LL

	public void addToFront(int item) {
		Node newFirst = new Node();
		newFirst.item = item;
		newFirst.next = first;
		first = newFirst;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void print() {
		Node temp = first;
		while (temp != null) {
			System.out.print(temp.item + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node findLastDup(Node front) {
		if (front == null)
			return null;

		Node dup = null;
		Node prev = front;
		for (Node temp = front.next; temp != null; temp = temp.next) {
			if (temp.item == prev.item) {
				dup = temp;
			}
			prev = temp;
		}
		return dup;
	}

	public void removeDup(Node front) {
		if (front == null)
			return;

		Node prev = front;
		for (Node temp = front.next; temp != null; temp = temp.next) {
			if (temp.item == prev.item) {
				prev.next = temp.next;
			} else {
				prev = temp;
			}
		}
	}

	public int removeAtFront() {

		if (isEmpty()) {
			return 0;
		}

		int item = first.item;
		first = first.next;
		return item;
	}

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addToFront(45);
		link.addToFront(45);
		link.addToFront(40);
		link.addToFront(40);
		link.addToFront(30);
		link.addToFront(30);
		link.addToFront(15);
		link.addToFront(15);
		link.addToFront(5);
		link.addToFront(5);
//		link.addToFront(2);
//		link.addToFront(1);
		link.print();
		link.removeDup(first);
		link.print();

	}
}
