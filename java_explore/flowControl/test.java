package flowControl;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int num,answer;
		answer = 1;
		
		System.out.println("Give me a number");
		num = kbd.nextInt();
		
		for(int i=1;i<=num;i++) {
			answer = answer * i;
		}
		System.out.println(answer);
		kbd.close();
	}

}
