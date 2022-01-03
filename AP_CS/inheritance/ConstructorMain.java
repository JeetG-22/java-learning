package inheritance;

public class ConstructorMain {

	public static void main(String[] args) {
		MultiClass2 obj = new MultiClass2();
		/*Will print out null if a different parameter is given to the above statement
		 * If 2 integers are given it will print out the first constructor
		 * If 2 doubles are given it will print out the second constructor
		 */ 
		//obj.print();
		obj.message();
		obj.simpleMessage(3, 4);
		

	}

}
