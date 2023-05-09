package chapter5;

public class BoxCars {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int numBox = 0;
		int i = 0;
		while(i<1000) {
			d1.roll();
			d2.roll();
			if( (d1.getFaceValue() == 6) && (d2.getFaceValue() == 6) ) {
				numBox++;
			}
			i++;
		}
		System.out.println("Number Of Box Cars: " + numBox);
		
		/* The theoretical probability of getting box cars is 1/36
		 * The experimental probability of getting box cars is numBox/1000
		 * The more you role the two die, the closer the experimental probability will be to the theoretical
		 * For example, If you role the die 100000 times the experimental probability will be closer to the
		 * theoretical compared to rolling the die 1000 times and 1000000 times will get it even closer...
		 */

	}

}
