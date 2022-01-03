package pro;
import java.util.Scanner;
public class WhileLoop2{
public static void main(String[] args){
Scanner kbd = new Scanner(System.in);
String userInput;
int count = 0;
System.out.println("Give me a sentence.");
userInput = kbd.nextLine();
while(count<4){
System.out.println(userInput);
count++;
}
kbd.close();
}
}
