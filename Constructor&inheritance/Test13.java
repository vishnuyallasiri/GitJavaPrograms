package Inheritance;
class An{
	public void m1() {
		System.out.println("m1() ");
		
	}
	public void s2() {
		System.out.println("S2 ");
		
	}
}
class B2 extends An
{
	public void m2() {
		this.m1();
		this.s2();
		System.out.println("B2");
	}
	public void s3() {
		System.out.println("B2");
	}
}
class c2 extends B2
{
	public void n2() {
		System.out.println("B2");
	}
	public void n3() {
		System.out.println("B2");
	}
}

public class Test13 {

	public static void main(String[] args) {
		c2 a2=new c2();
		a2.m1();
		a2.s2();
		a2.m2();
		a2.s3();
		a2.n2();
		a2.n3();
		

	}

}
