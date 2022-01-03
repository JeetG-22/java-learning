package chapter1.modifiers;

public class AbstractModifierRunnerClass extends AbstractModifierTestClass implements interfaceTest{
	
	public static void main(String[] args) {
		//Abstract classes can not be instantiated
		AbstractModifierTestClass test = new AbstractModifierTestClass();
		
	}

	@Override
	public void a() {
		/*
		 * Abstract methods must be implemented when a class extends it.
		 */
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		return 0;
	}

}

/*
 * Interfaces and methods in the interface are abstract by default
 * Including the prefix "abstract" is not needed
 */
abstract interface interfaceTest {
	int b();
}
