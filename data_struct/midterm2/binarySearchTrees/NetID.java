package midterm2.binarySearchTrees;

/*
 * We use this class as the key into a BST
 */
public class NetID implements Comparable<NetID> {

	private String netid;

	NetID(String netid) {
		this.netid = netid;
	}
	
	public String getID() {
		return netid;
	}

	public boolean equals(Object other) {
		if (other == null || !(other instanceof NetID)) {
			return false;
		}
		NetID o = (NetID) other;
		return netid.equals(o.netid);
	}

	public int compareTo(NetID other) {
		return netid.compareTo(other.netid);
	}
}