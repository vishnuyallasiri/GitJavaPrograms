package Inheritance;

class A5
{
	public A5() {
		System.out.println("a is ");
	}
	public A5(int a) {
		this(10,30);
		System.out.println("int a is");
	}
	public A5(int c,int b) {
		this();
		System.out.println("int a int b");
	}
}

class B5 extends A5
{
	public B5() {
		this(10,30);
		System.out.println("B is");
	}
	public B5(int c) {
		this();
		System.out.println("int c");
	}
	public B5(int b,int s) {
		super(10);
		System.out.println("int b int c");
	}
}

public class Strng {

	public static void main(String[] args) {
		new B5(10);

	}

}
