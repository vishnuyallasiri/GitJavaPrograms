import java.util.Scanner;
class Fib1
{
	public static void main(String[] args) 
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sn.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=n;i++){
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
	}
}
