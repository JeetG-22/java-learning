package midterm2;

public class CircularLinkedList<T> {
	
	private class Node<T> {
		Node<T> next;
		T item;
	}
	
	private Node<T> last;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void addToFront(T data) {
		Node<T> newFirst = new Node<T>();
		newFirst.item = data;
		
		if(last == null) { //If list is initially empty
			last = newFirst;
			newFirst.next = newFirst;
		} else {
			newFirst.next = last.next;
			last.next = newFirst;
		}
		size++;
	}
	
	public Node<T> removeFront() {
		
		//Empty list or one node
		if(size == 0 || last == last.next) {
			last = null;
			size = 0;
			return null;
		}
		
		Node<T> removedNode = last.next;
		last.next = last.next.next;
		size--;
		return removedNode;
		
	}
	
	public void print() {
		
		if(size == 0) return;
		
		Node<T> ptr = last.next; //Starts at the first node in the list
		do {
			System.out.print(ptr.item + " -> ");
			ptr = ptr.next;
		} while(ptr != last.next);
		System.out.println();
		
	}
	
	public Node<T> search(T target){
		
		if(size == 0) return null;
		
		Node<T> ptr = last.next;
		do {
			if(ptr.item.equals(target)) {
				return ptr;
			}
			ptr = ptr.next;
		} while(ptr != last.next);
		
		return null;
	}
	
	
	public static void main(String[] args) {
		CircularLinkedList<Integer> cll = new CircularLinkedList<Integer>();
		cll.addToFront(1);
		cll.addToFront(2);
		cll.addToFront(25);
		cll.addToFront(26);
		cll.addToFront(-22);
		cll.print();
		cll.removeFront();
		cll.removeFront();
		cll.print();
		cll.search(2).item = -2;
		cll.print();

	}

}
