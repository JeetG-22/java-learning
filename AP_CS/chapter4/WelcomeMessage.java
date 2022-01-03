package chapter4;

public class WelcomeMessage {

	public static void main(String[] args) {
		System.out.println(welcomeMessage(5, "Joe"));
	}
	public static String welcomeMessage(int visitorNumber, String name) {
		return "Welcome " + name + "! You are vistor number " + visitorNumber + ".";
	}

}
