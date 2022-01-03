package inheritance;

public class Constructor {
	//Having multiple constructors with different parameters is called overloading constructors
	public Constructor(int x, int y) {
		int sum = x / y;
		System.out.println(sum);
	}
	
	public Constructor(double x, double y) {
		double average = x+y;
		System.out.println(average);
	}
	
	private String printedName;
	public Constructor(String name) {
		printedName = name;
	}
	
	public String getValue() {
		return printedName;
	}
	
	public void print() {
		System.out.printf("Name: %s", getValue());
	}
}
