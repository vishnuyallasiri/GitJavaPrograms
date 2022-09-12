package GenericType;
class Gen <E>{
	public void m1(E arg) {
		System.out.println("m1 is executed");
	}
}


public class Comparetomethod {
	

	public static void main(String[] args) {
		Gen a1=new Gen();
		a1.m1(10);
		a1.m1("abc");

	}

}
