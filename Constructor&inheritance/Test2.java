package Stringabc;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle(Rectangle d, Rectangle b ){
		this.length=d.length;
		this.breadth=b.breadth;
	}
	void display() {
		System.out.println("the length of the rectangle"+length);
		System.out.println("the length of the rectangle"+breadth);
	}
	static void pattern() {
		System.out.println("******************************");
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(30,40);
		Rectangle r3=new Rectangle(r1,r2);
		
		r1.display();
		Rectangle.pattern();
		r2.display();
		Rectangle.pattern();
		r3.display();
		Rectangle.pattern();

	}

}
