package Dataencapsulatiom;
import java.util.*;
class Theatre{
	
	int seats=50;
	public static Theatre t=null;
	public void reserveSeats(int n) {
		if(n>seats) System.out.println(n+"Total seats avaliable in theater");
		else System.out.println("The seats are not avaliable");
		
		
	}
}
class BookingApp{
	public void bookTickets() {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number");
		int tickets=sn.nextInt();
		
	}
}

public class Bookmyshow {

	public static void main(String[] args) {
		

	}

}
