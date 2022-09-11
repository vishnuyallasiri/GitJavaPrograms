package Inheritance;
class Father{
	
	public void phn(){
	System.out.println("phn number");
	}
	
}
class Child extends Father{
	
	public void bicycle() {
		System.out.println("i have a bicycle");
	}
	public void phn() {//method overriding
		System.out.println("my phn number");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Child a1=new Child();
		a1.phn();
		a1.bicycle();
		a1.phn();

	}

}
