package chapter4.learnstring;

public class StringExercise {

	public static void main(String[] args) {
//		String letters = "abcdef";
//		System.out.println(letters.length());
//		System.out.println(letters.charAt(3));
//		System.out.println(letters.charAt(6));

//		int my = 4; 
//	     String v2 = "ABC"; 
//	    String v = (String) my + 1; 
//	     System.out.println(v + " " + v2); 
//	     System.out.println(my + " " + 1);

//		System.out.println();
//	     String s = "ABC"; 
//	     String t = new String(s); 
//	     if ("ABC".equals(s)) System.out.println("A"); 
//	     if (t == s) System.out.println("B"); 
//	     if (t.equals(s)) System.out.println("C"); 
//	     if ("ABC" == s) System.out.println("D"); 
//	     if ("ABC" == t) System.out.println("E");

//		String s = "ABCD";
//		s.toUpperCase();
//		s.trim();
//		s.substring(1, 3);
//		s += " two";
//		System.out.println(s.length());
//
//		
//	       StringBuilder sb = new StringBuilder(); 
//	       sb.append("AAA").insert(1, "BB").insert(4, "CCCC"); 
//	       System.out.println(sb); 
		
//	     String numbers = "012345678"; 
//	     System.out.println(numbers.substring(1, 3)); 
//	     System.out.println(numbers.substring(7, 7)); 
//	     System.out.println(numbers.substring(7));
		
	     String a = ""; 
	     a += 2; 
	     a += 'c'; 
	     a += false;             
	     if ( a == "2cfalse") System.out.println("=="); 
	     if ( a.equals("2cfalse")) System.out.println("equals");
	}

}
