package Inheritance;
class t1{
	t1(){
		System.out.println("Im the Non argument constructor");
	}
	t1(int a){
	System.out.println("im the onr argument int a");
	}
	t1(int a, int b){
		System.out.println("im the two argument constructor");
	}
}
class t2 extends t1{
	 t2() {
		
		System.out.println("im the no argument constructor of t2");
	}
	 t2(int c) {
		 super(10);
		System.out.println("im the one argument constructor in t2");
	
	}
	t2(int a, int b) {
		super(10);
		System.out.println("Im the two argument constructor in t2");
	}
}

public class Constructorchainging {

	public static void main(String[] args) {
		new t2(10);

	}

}
