package basicExercises;

public class ReplaceChar {

	public static void main(String[] args) {
		String str1 = "Hello World";
		char char1 = 'e';
		
		str1 = str1.replace('H', char1);
		for(int i = 0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

	}

}
