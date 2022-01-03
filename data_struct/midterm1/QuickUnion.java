package midterm1;

import java.util.Arrays;

public class QuickUnion {
	static private int id[];
	
	public QuickUnion(int n) {
		id = new int[n];
		for(int i = 0; i < n; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j; 
	}

	public static void main(String[] args) {
		QuickUnion u = new QuickUnion(10);
		u.union(1, 2);
		u.union(4, 5);
		System.out.println(Arrays.toString(id));
		u.union(6, 7);
		u.union(0, 1);
		u.union(2, 4);
		System.out.println(Arrays.toString(id));

	}

}
