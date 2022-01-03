package midterm2.binarySearchTrees;

public class LinkedQueue<T> {

	private Node<T> first; // reference to the first node in the linked list
	private Node<T> last; // reference to the last node in the linked list
	// private inner class only visible within LinkedStackOfStrings

	private class Node<T> {
		private T item; // data
		private Node<T> next; // link to next Node in the linked list
	}

	public boolean isEmpty() {
		return first == null;
	}

	// Running time?
	public void enqueue(T item) {

		Node<T> oldLast = last; // reference to current last node

		last = new Node<T>(); // instantiate a new Node object
		last.item = item; // data
		last.next = null; // next will point nowhere because it is the last node
		if (isEmpty()) {
			// first node to be added to the list
			first = last;
		} else {
			oldLast.next = last;
		}
	}

	// Running time?
	public T dequeue() {
		T item = first.item; // save the item to return
		first = first.next; // update first

		if (isEmpty())
			last = null; // last node to be removed from the list
		return item;
	}

	public static void main(String[] args) {

		LinkedQueue<String> queue = new LinkedQueue<String>();
		queue.enqueue("kiwi");
		queue.enqueue("pear");
		queue.enqueue("tomato");
		queue.enqueue("watermelon");
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}