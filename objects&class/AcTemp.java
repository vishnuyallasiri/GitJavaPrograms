package Oopsbasics;

class Ac{
	int temp;
	void settemp(int t) {
		temp=t;
		System.out.println("Temp is set to about"+t);
		
	}
	void displaytemp() {
		System.out.println("Ac temperature is"+temp);
	}
}
public class AcTemp {

	public static void main(String[] args) {
		Ac c1=new Ac();
		c1.settemp(23);
		c1.displaytemp();
		c1.settemp(18);
		c1.displaytemp();

	}

}
