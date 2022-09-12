package GenericType;
import java.util.*;
class S<E>{
	public void m1(E arg) {
		System.out.println("m1 is executed");
	}
}

public class Generic{

	public static void main(String[] args) {
		S<Integer> obj1=new <Integer>S();
		obj1.m1(10);
		S<String> obj2=new <String>S();
		obj2.m1
		("abc");
		S a1=new S();
		a1.m1(20);
		a1.m1("kb");
		
		
		

	}

}
