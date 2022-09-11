package Inheritance;
class A{
	public void m1() {
		System.out.println("m1() is exexcuted");
	}
	public void m2() {
		System.out.println("m2() is exexcuted");
	}
	public void m3() {
		System.out.println("m3() is exexcuted");
	}
}
class B extends A
{
	public void m4() {
		this.m1();
		this.m2();
		this.m3();
		System.out.println("m4 is exected");
	}
}


public class FirstInheritance {

	public static void main(String[] args) {
		B a1=new B();
		a1.m1();
		a1.m2();
		a1.m3();
		a1.m4();
	}

}
