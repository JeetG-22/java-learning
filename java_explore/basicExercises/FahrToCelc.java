package basicExercises;

public class FahrToCelc {

	public static void main(String[] args) {
		double celcius;
		for(int fahrenheit = 20; fahrenheit <= 77; fahrenheit+=3) {
			celcius = (5.0 / 9)*(fahrenheit - 32);
			System.out.println("Fahrenheit:" + fahrenheit + " | " + "Celcius:" + celcius);
		}
		

	}

}
