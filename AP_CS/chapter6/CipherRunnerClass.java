package chapter6;

public class CipherRunnerClass {

	public static void main(String[] args) {
		RouteCipher c = new RouteCipher(2,3);
		System.out.println(c.encryptMessage("Meet at midnight"));
		System.out.println(c.decryptMessage("Mte eati dmnitgAhA", 2, 3));
		System.out.println(c);

	}

}
