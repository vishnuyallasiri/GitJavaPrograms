package Inheritance;

class X
{
	int a=10;
	public void display() {
		System.out.println(a);
	}
}

class Y extends X
{
	int a=45;
	int b=20;
	public void display1() {
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(super.a);
	}
	
	
}
public class Multi {

	public static void main(String[] args) {
		Y c1=new Y();
		c1.display();
		c1.display1();

	}

}
