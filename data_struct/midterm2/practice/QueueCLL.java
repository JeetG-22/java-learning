package midterm2.practice;

//import midterm2.CircularLinkedList.Node;

public class QueueCLL <T>{
	
	private Node<T> last;
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private class Node<T> {
		T item;
		Node<T> next;
	}
	
	public void enqueue(T data) {
		
		Node<T> newNode = new Node<T>();
		newNode.item = data;
		
		if(isEmpty()) { //If list is empty
			last = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		size++;		
		
	}
	
	public T dequeue() {
		T item = null;
		
		if(isEmpty()) {
			return null;
		}
		
		if(size == 1) { //If queue has one node
			item = last.item;
			last = null;
			size--;
			return item;			
		}
		item = last.next.item;
		last.next = last.next.next;
		size--;
		return item;		
		
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
	

	public static void main(String[] args) {
		QueueCLL<Integer> q = new QueueCLL<Integer>();
		q.enqueue(1);
		q.enqueue(3);
		q.enqueue(25);
		q.enqueue(-23);
		q.print();
		System.out.println(q.dequeue());
		q.dequeue();
		q.dequeue();
		q.print();
	}

}
