package random;
import java.util.Scanner ;
import java.text.DecimalFormat;
public class Quiz {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.##");
		boolean userInput, userInput2, userInput3;
		boolean answers[]= {true, false, true};
		double count=0;
		int x=1;
		do {
			
		try {
		
		System.out.println("My favorite sport is soccer.");
		userInput=kbd.nextBoolean();
		if(userInput==answers[0]) {
			count++;	

		}
		System.out.println("I am a vegan");
		userInput2=kbd.nextBoolean();
		if (userInput2==answers[1]) {
			count++;	
		
		}
		System.out.println("Yash is dumb");
		userInput3=kbd.nextBoolean();
		if(userInput3==answers[2]) {
			count++;
	
		}
		x=2;
		count=count/3*100;
		System.out.println("Your grade is "+ df.format(count));
		
	
		} catch (Exception e) {
			System.out.println("You can't do that. Only enter true and false answers.");
			kbd.next();
	
	
		}
		} while(x==1);

		kbd.close();
	}
}
