package foundationtest;

import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarTest {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.parse("23:59:20");
		System.out.println(lt);
		lt = LocalTime.MIN;
		System.out.println(lt);
		LocalTime lt2 = LocalTime.MIDNIGHT;
		System.out.println(lt2.equals(lt));
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld = ld.plusMonths(1);
		System.out.println(ld);

	}

}
