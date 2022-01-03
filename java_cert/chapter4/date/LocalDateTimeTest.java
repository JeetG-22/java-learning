package chapter4.date;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		/*
		 * LocalDateTime class stores both date and time (uses "T" in output to separate date and time)
		 * Defines similar methods to that of LocalTime & LocalDate class
		 */
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println();
		LocalDateTime dateTime2 = LocalDateTime.of(2003, 7, 18, 7, 40, 59);
		System.out.println(dateTime2);
		
		//Testing methods already seen in the previous two classes (LocalTime & LocalDate)
		System.out.println(dateTime2.plusMonths(2));
		System.out.println(dateTime.isAfter(dateTime2));
		System.out.println(dateTime2.withYear(2006));

		
		

	}

}
