package Inheritance;
class Test1{
	int a;
	int b;
	public Test1(int a, int b) {// constructor with two parameters.
		this.a=a;
		this.b=b;
		
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+","+b);
	}
}
class Ns extends Test1{
	int a;
	int b;
	public Ns(int a, int b) {
		super(a,b);// passing the values from sub class constructors to super class Non-static data members. 
		
	}
	
}

public class calltosuper {

	public static void main(String[] args) {
		Ns a1=new Ns(20,40);
		a1.display();

	}

}
