package chapter6;

import java.util.Observer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class InheritanceAssignment {

	public static void main(String[] args) throws Exception {
//		Integer o1 = new Integer(1);
//		System.out.println(o1 instanceof Object);
//		
//		A a = new A();
//		B b = new B();
//		System.out.println(b instanceof t);

//		A a = new A();
//		B b = new B();
//		
//		a = (B)(t) b;
//		b = (B)(t)a;
//		a = (t) b;
//		I i = (C) a;
//		Object

//		A a = new A();
//		B b = new B();

//		Object o =a;
//		Runnable r = o;

//		Object o = a;
//		Runnable r = (Runnable) o;
//		
//		Observer ob = (Observer)o;

//		o = b;
//		Observer o2 = o;

//		Runnable r = (Runnable)b;

//		A a = null;
//		B b = null;
//		
//		a = (B) b;
//		b = a;
		
		A a = new B();
		a.play();

	}
}

class A{
	public void play() throws Exception{
		System.out.println("He");
	}
}

class B extends A{
	public void play() throws Exception, Exception{
		System.out.println("dlsgjlads");
	}
}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
//
//class A implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
////	int x=7;
////	static int y = 20;
//}
//
//class B extends A implements Observer{
//
////	int x = 10;
////	static int y = 30;
//
//	@Override
//	public void update(java.util.Observable o, Object arg) {
//		// TODO Auto-generated method stub
//		
//	}
//}
//
//class C extends B{}
//interface t{
//	
//}

//class Bird{
//	public Bird() {}
//}
//
//class Eagle extends Bird{
//	public String name;
//	public Eagle(String name) {
//		System.out.println();
//		this();
//	}
//	
//}
