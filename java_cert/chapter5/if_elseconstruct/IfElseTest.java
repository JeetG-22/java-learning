package chapter5.if_elseconstruct;

public class IfElseTest {

	public static void main(String[] args) {
		// Testing valid statements

		if (false)
			;
		else
			System.out.println("Hello");

		////////////////////////////////////////////////////////

//		if(true)
//		else
//			System.out.println("Hello"); 

		// Invalid (if statement must have braces or semicolon)

		////////////////////////////////////////////////////////

		boolean bool = false;
		if (bool = true) {
			System.out.println(bool);
		}

		int x = 25;
		if ((x = x + 20) == 45) {
			System.out.println(x);
		}

		////////////////////////////////////////////////////////
		
//		if(true) 
//			System.out.println();
//		System.out.println();
//		else
//			System.out.println();
		// Invalid (An else statement must come immediately after the if statement)
		
		////////////////////////////////////////////////////////
		
		//The for loop is considered a single line under the if statement
		if(true)
			for(int i = 0; i < 5; i++) {
				System.out.print(i + " ");
				i++;
			}
		
		System.out.println();
		if(false)
			for(int i = 0; i < 5; i++) 
				System.out.print(i + " ");
				System.out.println("Outside the if and for loop statements");

		////////////////////////////////////////////////////////
				
		/**
		 * Match the if and else statements from the inside and going outwards
		 * 
		 */
		int score = 100;
		if(score < 200) //Doesn't have an else statement to match with
		if(score < 400) //2
		if(score > 300) //1
			System.out.println("Score > 300");
		else //1
			System.out.println("Score < 300");
		else //2
			System.out.println("Score < 400");
		
		////////////////////////////////////////////////////////

	}

}
