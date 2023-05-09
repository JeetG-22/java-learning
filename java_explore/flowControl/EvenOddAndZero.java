package flowControl;
import java.util.Scanner;
public class EvenOddAndZero {

	public static void main(String[] args) {
		//Jeet Gupta 5/31/19
		//Asking the user for a number and printing out the number of even, odds, and zeros in the function
		
		//Declare
		Scanner kbd = new Scanner(System.in);
		int num;
		int i = 1;
		int even = 0;
		int odd = 0;
		int zero = 0;
		
		//Ask User
		System.out.println("Give me a number.");
		num = kbd.nextInt();
		
		//Calculate
		while(num!=0) {
			 if((num/i) % 2 == 0 && (num/i) % 10 != 0) {
				System.out.println(i+ "even" + num/i);
				even++;
				num = num/i;
				i=i*10;
				System.out.println(num + " in even");
			}
			 if((num/i) % 2 == 1){
				System.out.println(i+ "odd" + num/i);
				odd++;
				num = num/i;
				i=i*10;
				System.out.println(num + " in odd");
			}
			 else {
			    System.out.println(i+ "zero" + num/i);
				zero++;
				num = num/i;
				i=i*10;
				System.out.println(num+ " in zero");
				
			}
		}
		System.out.println("The number of odd numbers is " + odd);
		System.out.println("The number of even numbers is " + even);
		System.out.println("The number of zero numbers is " + zero);
		kbd.close();
		
	}

}
