package midterm2.binarySearchTrees;

import java.util.NoSuchElementException;

public class BST<K extends Comparable<K>, V> {

	private Node root; // root node of the BST
	private int size; // number of items (nodes) in the BST
	// Node class keeps the pair (key, value) together

	private class Node {
		K key;
		V value;
		private Node left;
		private Node right;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	// Insert the pair <key, value> into BST
	// If already in the BST, update it.
	public void put(K key, V value) {
		// 1. Search for key
		Node ptr = root; // starts pointer at root
		Node prev = null;
		int cmp = 0;
		while (ptr != null) {
			cmp = key.compareTo(ptr.key);
			if (cmp == 0) {
				// found key in the BST, update value for key
				ptr.value = value;
				return;
			}
			prev = ptr;
			if (cmp < 0) {
				// target is smaller than ptr.key
				ptr = ptr.left;
			} else {
				// target is greater than ptr.key
				ptr = ptr.right;
			}
		}
		// ptr is null
		// 2. Key not present in BST
		// Insert at the failure point (must keep a prev pointer)
		// Two cases: bst is empty or bst has at least one element
		Node newNode = new Node(key, value); // create a new node to be inserted
		if (prev == null) {
			// bst is empty
			root = newNode;
		} else if (cmp < 0) {
			// hookup to the left of prev
			prev.left = newNode;
		} else {
			// hookup to the right of prev
			prev.right = newNode;
		}

		size += 1;
	}

	// Searches for target
	// Returns the value associated with @target
	// If @target is not present then return null
	public V get(K target) {
		Node ptr = root; // starts pointer at root
		while (ptr != null) {
			int cmp = target.compareTo(ptr.key);
			if (cmp == 0) {
				// found target
				return ptr.value;
			}
			if (cmp < 0) {
				// target is smaller than ptr.key
				ptr = ptr.left;
			} else {
				// target is greater than ptr.key
				ptr = ptr.right;
			}
		}
		return null; // key is not found
	}

	public void delete(K target) {
		// 1. find node to delete: call it x
		Node x = root;
		Node p = null; // previous or parent
		int c = 0;
		while (x != null) {
			c = target.compareTo(x.key);
			if (c == 0) {
				break; // found target to delete
			}
			p = x;
			/*
			 * if ( c < 0 ) { x = x.left; } else { x = x.right; }
			 */
			x = (c < 0) ? x.left : x.right; // same as the if above
		}
		// 2. if x is not found
		if (x == null) {
			throw new NoSuchElementException(target + " not found");
		}
		// 3. case 3 (does x have 2 children?)
		Node y = null;
		if (x.left != null && x.right != null) {
			// 3.1 find the inorder predecessor
			y = x.left;
			p = x;
			while (y.right != null) { // go all the way right
				p = y;
				y = y.right;
			}
			// 3.2 copy y's key over x's key
			x.key = y.key;
			// 3.3 prepare to delete
			x = y;
		}
		// 4. handle case 1 (leaf) and 2 (one child)
		Node tmp = (x.right != null) ? x.right : x.left;
		if (x == p.left) {
			p.left = tmp;
		} else {
			p.right = tmp;
		}
		size -= 1;
	}

	// Enqueue all the keys into queue
	public LinkedQueue<K> keys() {
		LinkedQueue<K> q = new LinkedQueue<K>();
		inorder(root, q);
		return q;
	}

	// Traverses the tree inorder: ascending order
	public void inorder(Node x, LinkedQueue<K> q) {
		if (x == null)
			return;
		inorder(x.left, q);
		q.enqueue(x.key);
		inorder(x.right, q);
	}

	public void preorder(Node x, LinkedQueue<K> q) {
		if (x == null)
			return;
		q.enqueue(x.key);
		preorder(x.left, q);
		preorder(x.right, q);
	}

	public void postorder(Node x, LinkedQueue<K> q) {
		if (x == null)
			return;
		postorder(x.left, q);
		postorder(x.right, q);
		q.enqueue(x.key);
	}

	public void print() {
		foo(root);
	}

	private void foo(Node x) {
		if (x == null)
			return;
		System.out.print(x.key);
		foo(x.left);
		foo(x.right);
	}

	public static void main(String args[]) {
		// Key is the NetID
		// Value is the Student
		BST<NetID, Student> bst = new BST<NetID, Student>();
		/**
		// create netid and student objects
		NetID id = new NetID("jm123");
		Student s = new Student("John Mars", 2022);
		// then insert
		bst.put(id, s);
		// OR create and insert in one line
		bst.put(new NetID("ds39"), new Student("David Sun", 2024));
		bst.put(new NetID("af43"), new Student("Ann Fleur", 2023));
		bst.put(new NetID("cs87"), new Student("Caroline Smith", 2022));
		bst.put(new NetID("mh421"), new Student("Martha Hamilton", 2024));
		bst.put(new NetID("js564"), new Student("John Stweart", 2022));
		bst.put(new NetID("mm34"), new Student("Marc Medina", 2025));
		s = bst.get(new NetID("js564"));
		System.out.println(s);
		// Retrieve all keys
		LinkedQueue<NetID> allKeys = new LinkedQueue<NetID>();
		bst.inorder(bst.root, allKeys);
		**/
		
		bst.put(new NetID("A"), new Student("Dan", 2025));
		bst.put(new NetID("B"), new Student("Chad", 2027));
		bst.put(new NetID("C"), new Student("Jake", 2021));
		
		LinkedQueue<NetID> allKeys = new LinkedQueue<NetID>();
		bst.postorder(bst.root, allKeys);
//		bst.delete(new NetID("abc123"));
//		bst.postorder(bst.root, allKeys);
		
		while (!allKeys.isEmpty()) {
			System.out.println(allKeys.dequeue().getID());
		}
		
		/**
		bst.delete(new NetID("af43"));
		// Retrieve all keys
		allKeys = new LinkedQueue<NetID>();
		bst.inorder(bst.root, allKeys);
		while (!allKeys.isEmpty()) {
			System.out.println(allKeys.dequeue().getID());
		}
		**/
	}
}