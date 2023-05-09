package chapter6;

public class Manipulate2D {

	public static void main(String[] args) {
		String[][] words = { { "The", "Grass", "Is", "Green" }, { "The", "Sky", "Is", "Blue" },
				{ "Sign", "Up", "For", "Learnerator" } };
		
		//Print Array
		for(int i = 0; i < words.length; i++) {
			System.out.println(genSentence(words)[i]);
		}
	}

	public static String[] genSentence(String[][] words) {
		String[] sent = new String[words.length];
		String sentence = "";
		for (int row = 0; row < words.length; row++) {
			for (int col = 0; col < words[row].length; col++) {
				sentence += words[row][col] + " ";
			}
			sent[row] = sentence;
			sentence = "";
		}
		return sent;
	}

}
