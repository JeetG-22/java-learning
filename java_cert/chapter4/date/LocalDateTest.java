package chapter4.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {

	//****LocalDate class is immutable****
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 4, 7);
		System.out.println(date);
		
		//Getting date from system clock
		System.out.println();
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		
		/*
		 * Using the parse method with String input to instantiate LocalDate
		 * Needs to be inputted with the syntax below otherwise a DateTimeParseException will occur
		 * Month must be two digits (Ex. 01)
		 * Day must be two digits (Ex. 01)
		 * Year must be four digits (Ex. 2003)
		 */
		System.out.println();
		LocalDate date3 = LocalDate.parse("2015-05-17"); 
		System.out.println(date3);
		
		//Querying data
		System.out.println();
		System.out.println(date.getDayOfMonth()); //Returns the int value
		System.out.println(date.getDayOfWeek()); //Returns an enum value
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth()); //Returns an enum value
		System.out.println(date.getMonthValue()); //Returns the int value
		System.out.println(date.getYear());
		
		
		//Compares whether a date, chronologically, is before or after another date
		System.out.println();
		System.out.println(date.isAfter(date3));
		System.out.println(date.isAfter(date2));
		System.out.println(date.isBefore(date3));
		
		//the minusXX() and plusXX() methods return a new LocalDate with the substracted/added values specified
		//These methods consider leap years
		System.out.println();
		LocalDate date4 = LocalDate.of(2004,03,10);
		System.out.println(date4.minusDays(10));
		System.out.println(date4.minusMonths(2));
		System.out.println(date4.minusWeeks(30));
		System.out.println(date4.minusYears(1));
		System.out.println(date4.plusDays(20));
		System.out.println(date4.plusMonths(3));
		System.out.println(date4.plusWeeks(2));
		System.out.println(date4.plusYears(4));
		
		//withXX() methods return a new LocalDate with the replaced values specified by the user
		System.out.println();
		LocalDate date5 = LocalDate.of(2002,02,22);
		System.out.println(date5.withDayOfMonth(21));
		System.out.println(date5.withDayOfYear(206));
		System.out.println(date5.withMonth(3));
		System.out.println(date5.withYear(76));
		
		//Converting to other types using LocalDate class methods
		System.out.println();
		LocalDate testDate = LocalDate.of(2020, 03, 26);
		System.out.println(testDate.atTime(6, 30)); //atTime() returns LocalDateTime which appends the time to LocalDate
		System.out.println(testDate.atTime(LocalTime.of(7, 30)));
		System.out.println(testDate.toEpochDay()); //Returns days since January 1st, 1970 (Unix time)

	}
	
	

}
