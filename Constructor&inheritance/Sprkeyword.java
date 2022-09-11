package Inheritance;
class A1{
	public A1() {
		System.out.println("Im the A1()");
	}
}
class B1 extends A1{
public B1() {
	System.out.println("Im the B1()");
	}
}

public class Sprkeyword {

	public static void main(String[] args) {
		new B1();

	}

}
