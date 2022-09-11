package Oopsbasics;
class Account{
	int bal;
}
public class HowtouseObjectReference {

	public static void main(String[] args) {
	Account A;
	A=new Account();
	A.bal=3000;
	System.out.println(A.bal);
	Account B=A;
	System.out.println(B.bal);
	
	

	}

}
