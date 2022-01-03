package random;

public class FizzBuzz {
	public static void main(String[] args) {
		int number;
		number = 1;
		while(number <= 100) {
			
		if(number%3 == 0 && number%5 != 0 ) {
			System.out.println("Fizz");
			number++;
		} else if(number%5 == 0 && number%3 != 0) {
			System.out.println("Buzz");
			number++;
		} else if(number%3 == 0 && number%5 == 0) {
			System.out.println("Fizz Buzz");
			number++;
		} else {
			System.out.println(number);
		}
			
		}	
	}
}
