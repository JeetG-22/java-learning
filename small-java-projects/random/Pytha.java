package random;
import java.util.Scanner;
public class Pytha {

	public static void main(String[] args) {
        Scanner kbd = new Scanner (System.in);
        int integer;
        int integer1;
        double answer;
        int x = 1;
        do {
        	System.out.println("Using this program, you can use the Pythagorean Thereom to caluclate the length of an unknown side of a triangle.");
            System.out.println("Depending on the sides you already know, type the letter of the variable you don't know in the formula a^2 + b^2 = c^2. If a put 1, if b put 2, if c put 3.");
            integer = kbd.nextInt();
        switch(integer) {
        case 1:
            System.out.println("Now, type your b value, press enter, then your c value");
            integer = kbd.nextInt();
            integer1 = kbd.nextInt();
            answer = Math.sqrt((Math.pow(integer1, 2))-(integer*integer));
            System.out.println ("Your a value is " + answer);
  
            break;
        case 2:
            System.out.println("Now, type your a value, press enter, then your c value");
            integer = kbd.nextInt();
            integer1 = kbd.nextInt();
            System.out.print("Your b value is ");
            System.out.println(Math.sqrt((integer1*integer1)-(integer*integer)));
            break;
        case 3:
            System.out.println("Type your a value");
            integer = kbd.nextInt();
            System.out.println("Type your b value");
            integer1 = kbd.nextInt();
            answer = Math.hypot(integer,integer1); 
            System.out.print("Your c value is " + answer);  
            break;
           default:
        	   x=1;
        	   System.out.println("Error.");
        	   break;
        }
       
    }
while(x==1); 
        	
        
        kbd.close();

	}
}

