package Inheritance;
class A11{
	public A11() {
		
		System.out.println("Im the A1()");
	}
	public A11(int a) {
		
		System.out.println("Im the A11()");
	}
}

class B14 extends A1{
	int a;
public  B14(int a) {
	
	this.a=a;
	System.out.println("Im the B1()");
	System.out.println(a);
	}
}

public class Ard1 {

	public static void main(String[] args) {
		new B14(10);

	}

}
