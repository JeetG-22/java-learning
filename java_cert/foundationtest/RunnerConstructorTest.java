package foundationtest;

public class RunnerConstructorTest {

	public static void main(String[] args) {
//		ConstructorTest obj = new ConstructorTest();
		String[] arr = {"Test", "Hello", "Whatsup"};
		multiArgs(arr);

	}
	public static void multiArgs(String ... args) {
		for(String word : args) {
			System.out.println(word);
		}
	}

}
