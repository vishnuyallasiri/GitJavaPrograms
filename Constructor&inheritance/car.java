package Inheritance;
class car2{
	String color;
	car2(String color){
		this.color=color;
		
	}
}
class Helper{
	public void colorchange(car2 a) {
		a.color="balck";
		System.out.println(a.color);
	}
}

public class car {

	public static void main(String[] args) {

		car2 c1=new car2("red");
		System.out.println(c1.color);
		Helper a1=new Helper();
		a1.colorchange(c1);

	}

}
