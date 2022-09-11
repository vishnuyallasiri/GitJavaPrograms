package Oopsbasics;
class Rectangle{
	int length;
	int breadth;
	void initialize(int l, int b) {
		length=l;
		breadth=b;
		System.out.println("Initialization has done");
	}
	void display() {
		System.out.println("The length of rectangle ="+length);
		System.out.println("The breadth of rectangle ="+breadth);
	}
	void displayArea() {
		System.out.println("Area of the rectangle="+(length*breadth));
	}
	void displayparameter() {
		int p=2*(length+breadth);
		System.out.println("The parameter of the rectangle="+p);
	}
}

public class RectangularInz {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.initialize(10, 30);
		r1.display();
		r1.displayArea();
		r1.displayparameter();
		

	}

}
