package foundationtest;

public class TestInterface implements Test, Test2{
	static int number = 10;
	public static void main(String[] args) {

//		Test inf = new TestInterface();
//		inf.print();
//		Test.testingPrint();
//		testingPrint();
//		System.out.println(Test.num);
//		System.out.println(Test2.num);
		Test inf = new TestInterface();
		System.out.println(inf.add());
	}
	public void print() {
		this.number = 20;
	}
	
	public static void testingPrint() {
		System.out.println("Hello");
	}
	
	public static String testingPrint(int nums) {
		return null;
	}
	@Override
	public int add() {
		
		return 10;
	}
	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}
}
