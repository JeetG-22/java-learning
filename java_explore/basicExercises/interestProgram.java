package basicExercises;
import java.text.DecimalFormat;
public class interestProgram {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		int time;
		double initialAm = 1000;
		double answer;
		for(time = 1; time <= 10; time++) {
			answer = initialAm * 1.08;
			System.out.println("In year " + time + " you earned $" + df.format(answer-initialAm));
			initialAm = answer;
			
			 
		}

	}

}
