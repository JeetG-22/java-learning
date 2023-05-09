package chapter4;

import interfaceAbstract.Lockable;

public class Coin implements Lockable {
	private boolean face;
	private int key, unlock, lock;
	private boolean isLocked;

	public Coin() {
		flip();
	}

	public void flip() {
		if (isLocked == false) {
			face = Math.random() < .5; // True = heads / False = tails
		}
	}

	public boolean isHeads() {
		if (face) {
			return true;
		}
		return false;
	}

	public String toString() {
		if (isLocked == false) {
			if (isHeads() == true) {
				return "HEADS";
			}
			return "TAILS";
		}
		return "Coin is locked! Please enter the right key to unlock.";
	}

	@Override
	public void setKey(int n) {
		key = n;
		System.out.println("Key is Set!");
	}

	@Override
	public void lock(int j) {
		lock = j;
		if(lock == key) {
			System.out.println("Coin is Locked");
			isLocked = true;
		}
		
	}

	@Override
	public void unlock(int k) {
		unlock = k;
		if(unlock == key) {
			System.out.println("Coin is Unlocked!");
			isLocked = false;
		}

	}

	@Override
	public boolean locked() {
		return isLocked;
	}

}
