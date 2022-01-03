package midterm2;

public class DoublyLinkedList <T> {
	
	private Node<T> first;
	private int size;
	
	private class Node<T> {
		T item;
		Node<T> next, prev;
	}
	
	public int getSize() {
		return size;
	}
	
	//Inserts at the front of the DLL
	public void addToFront(T data) {
		
		//Creates new node with the data
		Node<T> newNode = new Node<T>();
		newNode.item = data;
		
		if(size == 0) { //If list is empty
			first = newNode;
		} else {
			newNode.next = first;
			first.prev = newNode;
			first = newNode;
		}
		size++;
		
	}
	
	public void print() {
		System.out.print("null <-> ");
		for(Node<T> temp = first; temp != null; temp = temp.next) {
			System.out.print(temp.item + " <-> ");
		}
		System.out.println("null");
	}
	
	/*
	 * Worst Case: O(n) if target node is at the end of the list
	 * Best Case: O(1) if target node is at the front of the list
	 */
	public void insertAfter(T target, T data) {
		Node<T> newNode = new Node<T>();
		newNode.item = data;
		for(Node<T> temp = first; temp != null; temp = temp.next) {
			if(temp.item.equals(target)) {
				newNode.prev = temp;
				newNode.next = temp.next;
				temp.next = newNode;
				if(newNode.next != null) { //Checks to see if the target node is at the end of the list
					newNode.next.prev = newNode;
				}
				size++;
			}
		}
		
	}
	
	public void reverseDLL() {
		if(first == null) return;
		Node<T> ptr = first, prevNode = null, nextNode = null;
		while(ptr != null) {
			nextNode = ptr.next;
			ptr.next = ptr.prev;
			ptr.prev = nextNode;
			prevNode = ptr;
			ptr = nextNode;
		}
		first = prevNode;
	}
	

	public Node<T> deleteNode(T target) {
		Node<T> temp = first;
		while(temp != null) {
			if(temp.item.equals(target)) break;
			temp = temp.next;
		}
		
		if(temp == null) { //If target node could not be found in the list
			return null;
		}
		
		if(temp.next == null) { //Edge Case 1: If target node is at the end of the list
			temp.prev.next = null;
		} else if(temp.prev == null) { //Edge Case 2: If target node is at the front of the list
			temp.next.prev = null;
			first = temp.next; //adjusting the first pointer in the list
		} else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
		
		//update the size of the list
		size--;
		return temp;
	}
	
	public void removeDuplicateSorted() {
		if(size == 0) return;
		
		Node<T> prev = first;
		for(Node<T> temp = first.next; temp != null; temp = temp.next) {
			if(prev.item.equals(temp.item)) {
				if(temp.next != null) { //Handles edge case (if node is at the end of list)
					temp.next.prev = prev;
				}
				prev.next = temp.next;
				temp = prev;
			} else {
				prev = temp;
			}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
		dll.addToFront(9);
		dll.addToFront(9);
		dll.addToFront(9);
		dll.addToFront(2);
		dll.addToFront(1);
		dll.addToFront(1);
		dll.print();
		dll.removeDuplicateSorted();
		dll.print();
		
		
		
//		dll.addToFront(9);
//		dll.addToFront(11);
//		dll.addToFront(12);
//		dll.insertAfter(11, 10);
//		dll.insertAfter(9, 25);
//		dll.print();
//		dll.reverseDLL();
//		dll.deleteNode(9);
//		dll.print();
//		dll.deleteNode(12);
//		dll.print();
//		dll.deleteNode(25);
//		dll.print();
//		System.out.println(dll.getSize());
//		dll.addToFront(-22);
//		dll.print();
//		System.out.println(dll.getSize());
	}

}
