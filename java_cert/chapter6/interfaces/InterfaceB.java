package chapter6.interfaces;

public interface InterfaceB extends BaseInterfaceC {
	int num = 20;
	
	public void print();
	
	default void emptyMethod() {}
	
//	public String print2();
}
