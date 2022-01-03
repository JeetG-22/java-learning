package chapter4.date;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateExercise {

	public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2016, Month.APRIL, 30); 
//        date.plusDays(2); 
//        date.plusYears(3); 
//        System.out.println(date.getYear() + " " 
//           + date.getMonth() + " " + date.getDayOfMonth()); 
//        
//        int arr[] = {1};
//        int arr2[] = {1};
//        System.out.println(arr.equals(arr2));
//         
//        ArrayList<Integer> aList = new ArrayList<>();
//        ArrayList<Integer> aList2 = new ArrayList<>();
//        System.out.println(aList.remove(0));
//        System.out.println(aList.equals(aList2));
		
	     int[] random = { 16, -41, 112, 10, -110 }; 
	     int x = 112; 
	     int y = Arrays.binarySearch(random, x); 
	     System.out.println(y);
	     
	     List<String> list = new ArrayList<String>(); 
	     list.add("A"); 
	     list.add("B"); 
	     list.add(7); 
        
        

	}

}
