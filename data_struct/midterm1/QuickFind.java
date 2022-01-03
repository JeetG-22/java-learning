package midterms.first;

import java.util.Arrays;

public class QuickFind {
	
	static private int id[];
	
	public QuickFind(int n) {
		id = new int[n];
		for(int i = 0; i < n; i++) {
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	//Changes every entry of id[q] with id[p]
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length; i++) {
			if(pid == id[i]) {
				id[i] = qid;
			}
		}
	}

	public static void main(String[] args) {
		QuickFind f = new QuickFind(10);
		f.union(9, 0);
		f.union(1, 8);
		f.union(2, 7);
		f.union(2,8);
		System.out.println(Arrays.toString(id));
		f.union(9,1);
		System.out.println(Arrays.toString(id));
	}

}
