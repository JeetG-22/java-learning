package chapter5;

public class Light {
	
	String color;

	public Light() {
		color = "Red";
	}
	public void change() {
		if(color.equalsIgnoreCase("Red")) {
			color = "Green";
		}
		else if(color.equalsIgnoreCase("Green")) {
			color = "Yellow";
		}
		else if(color.equalsIgnoreCase("Yellow")) {
			color = "Red";
		}
	}

	public String toString() {
		return color;
	}

}
