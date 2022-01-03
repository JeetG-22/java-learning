package chapter4.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {

	//****LocalTime class is immutable****
	public static void main(String[] args) {
		//LocalTime stores the time in hours, mins, sec, nanosec (if needed). Precision lvl: nanosec
		LocalTime time = LocalTime.of(4, 30, 6, 47014);
		System.out.println(time);

		/*
		 * DateTimeException is thrown if the time passed to the method is invalid
		 * LocalTime does not use AM or PM. Hours should be specified using values ranging from 0-23
		 */
		
		//the static method now() returns the current time from the system clock
		System.out.println();
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		/*
		 * Using parse method lets you pass a string of a particular format as the hours, mins, sec
		 * Input needs to be in a certain format for there to be no exception thrown at runtime
		 * Hours, minutes, seconds must be two digits (Ex. 09, 11) and must be seperated by colons (:)
		 */
		System.out.println();
		LocalTime time3 = LocalTime.parse("04:37:43");
		System.out.println(time3);
		
		//LocalTime constants
		System.out.println();
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
		
		//getXX() lets you query data from LocalTime obects
		System.out.println();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		//isAfter() & isBefore() checks whether one time is before or after another time
		System.out.println();
		System.out.println(time.isAfter(time3));
		System.out.println(time.isBefore(time2));
		
		//the minusXX() and plusXX() returns a LocalTime with the substracted/added values
		System.out.println();
		LocalTime time4 = LocalTime.of(4, 0, 0);
		System.out.println(time4);
		System.out.println(time4.plusHours(2));
		System.out.println(time4.plusMinutes(102));
		System.out.println(time4.minusSeconds(60));
		
		//withXX() replaces instance values with the arguments passed and returns a LocalTime
		System.out.println();
		System.out.println(time4.withMinute(40));
		System.out.println(time4.withSecond(59));
		
		//atDate() combined LocalTime with LocalDate to create and return LocalDateTime
		System.out.println();
		LocalTime time5 = LocalTime.now();
		System.out.println(time5.atDate(LocalDate.of(2021, 4, 7)));
	}

}
