package foundationtest;

public interface Test2 {
	int num = 20;
	public default void print() {
		System.out.println("hello");
	}
}
