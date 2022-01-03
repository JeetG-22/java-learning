package midterm3;

import java.util.Arrays;

/*
 * Priority Queue implementation of either a Max PQ or a Min PQ
 * 
 */
public class PQ<Key extends Comparable<Key>> {

	private final int MAX_PQ = 1;
	private final int MIN_PQ = 2;

	private Key[] pq;
	private int n; // number of items in the priority queue
	private int mode; // is this a max pq or a min pq?

	/*
	 * root is at index 1
	 * 
	 * @mode defines if the PQ is a Min PQ or a Min PQ
	 */
	public PQ(int capacity, int mode) {
		pq = (Key[]) new Comparable[capacity + 1];
		this.mode = mode; // mode figures out if the user wants a max or min heap
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public void insert(Key key) {
		pq[++n] = key; // inserting key into the PQ
		swim(n);
	}

	public Key delete() { // Could be deleting the min or max (at the root)
		Key itemToReturn = pq[1];
		exch(1, n--);
		sink(1);
		pq[n + 1] = null; // clean up
		return itemToReturn;

	}

	private void swim(int k) {
		if (mode == MAX_PQ) { // max pq: parent is greater or equal to children
			while (k > 1 && less(k / 2, k)) {
				exch(k / 2, k);
				k = k / 2;
			}
		} else { // min pq: parent is smaller or equal to the children
			while (k > 1 && greater(k / 2, k)) {
				exch(k / 2, k);
				k = k / 2;
			}
		}
	}

	private void sink(int k) {
		if (mode == MAX_PQ) {
			while (2 * k <= n) { // Checking to see if there are even any children to compare to the parent node
				int j = 2 * k; // Getting the left child of k
				if (j < n && less(j, j + 1)) { // Finding which child has a greater key value
					j++;
				}
				if (!less(k, j)) { // Checking to see if the greatest value child in less than k
					break;
				}
				exch(k, j); // Swapping the parent node with the child to mantain max PQ
				k = j; // Pointing k to be the swapped node and checking it with its new children
			}
		} else { // min pq:
			while (2 * k <= n) { 
				int j = 2 * k; // Getting the left child of k
				if (j < n && greater(j, j + 1)) { // Finding which child has a smaller key value
					j++;
				}
				if (!greater(k, j)) { // Checking to see if the smallest value child in greater than k
					break;
				}
				exch(k, j); // Swapping the parent node with the child to mantain min PQ
				k = j; // Pointing k to be the swapped node and checking it with its new children
			}
		}
	}

	private void exch(int i, int j) {
		Key temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}

	private boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0; // counts towards running time
	}

	private boolean greater(int i, int j) {
		return pq[i].compareTo(pq[j]) > 0;
	}

	public void print() {
		System.out.println(Arrays.toString(pq));
	}

	public static void main(String[] args) {
		PQ<Integer> pq = new PQ<Integer>(10, 1);
		pq.insert(75);
		pq.insert(100);
		pq.insert(45);
		pq.insert(700);
		pq.insert(-45);

		pq.print();

	}

}
