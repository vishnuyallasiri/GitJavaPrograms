class Student 
{
	String name;
	int rollno;
	private static int n=100;
	private static String clg="NARayana";
	Student(String s){
		name=s;
		rollno=n++;

	}
	void display(){
		System.out.println("Student="+name);
		System.out.println("Student="+rollno);
		System.out.println("School name="+clg);
	}
}
class Test21
{

	public static void main(String[] args) 
	{
		Student s1=new Student("vish");
		Student s2=new Student("vi");
		Student s3=new Student("v");
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
