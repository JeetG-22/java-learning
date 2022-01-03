package chapter1.nestedClass;

public class NestedClass {
	private static String word;
	/*
	 * Needs to be a static class for it to be referenced outside of this class
	 * Note: You make nested classes if it is only being used in one place
	 */
	public static class Cube {
		/*
		 * Private access means that "sides"  can be used only by the class in which
		 * it was created
		 */
		private int sides; 
		public Cube() {
			sides = 6;
		}

		public int getSides() {
			return sides;
		}

		// Nested class inside a nested class
		static class Cube2 {
			private int sides;

			public Cube2() {
				sides = 8;
				word = "Hello";
			}

			public int getSides() {
				return sides;
			}
			public String getWord() {
				return word;
			}
		}
	}

}
