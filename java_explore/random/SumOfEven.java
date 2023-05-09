package random;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		//Jeet Gupta 5/30/19
		//Printing the sum of all even integers between 2 and input value
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int userInt;
		int sum=0;
		int i=2;
		
		//Ask User
		System.out.println("Give me an integer and I will input the sum of all even integers between 2 and your value.");
		userInt = kbd.nextInt();
		
		//Calculate using while loop
		if(userInt>=2) {
			while(i<=userInt) {
			sum=sum+i;
			i=i+2;
			}
			System.out.println(sum);
			}
		else {
			System.out.println("Error! Your input value is less than 2");
		}
		kbd.close();
		
	}

}
