package Oopsbasics;
class Account1{
	int bal;
	
}
public class HowtochangetheobjectreferenceToNull {

	public static void main(String[] args) {
		Account1 a1;
		a1=new Account1();
		a1.bal=10000;
		System.out.println(a1.bal);
		a1=new Account1();
		System.out.println(a1.bal);

	}

}
