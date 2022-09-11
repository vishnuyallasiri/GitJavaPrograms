package Oopsbasics;

public class calc {
	static void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		calc a1=new calc();
		a1.add(10, 30);//using the object reference 
		calc.add(20, 30);// for static methods no need to create the object we can use the class name

	}

}
