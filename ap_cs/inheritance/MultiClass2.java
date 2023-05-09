package inheritance;

public class MultiClass2 {
	private static int var = 0; 
	private String word = "Cardboard";
	public void simpleMessage(String statement) {
		System.out.println(statement);
	}
	public void simpleMessage(double firstLeg, double secondLeg) {
		double hypot = Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2));
		var++;
		System.out.println(var);
		//return hypot;
	}
	public void message() {
		var++;
		System.out.println(var);
	}


}
