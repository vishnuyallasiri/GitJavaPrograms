package Inheritance;
class AZ{
	 public void m1() {
		System.out.println("m1 is executed");
		
	}
}
class ZA extends AZ{
	 public void m1() {
		System.out.println("m2 is changed");
		
	}
}

public class Mro {

	public static void main(String[] args) {
		AZ a1=new ZA();
		a1.m1();

	}

}
