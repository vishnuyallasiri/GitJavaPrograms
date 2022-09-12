package Stringabc;

class Student
{
	int id;
	String name;
	int age;
	Student(int id, String name, int age)
	{
		this.id=id;
		this.age=age;
		this.name=name;	
	}
	Student(int id, String name, Student n)
	{
		this.id=id;
		this.age=n.age;
		this.name=name;	
	}
		Student(int id, Student s, int age)
		{
			this.id=id;
			this.age=age;
			this.name=s.name;	
		}

		
		
 	void display()
	{
		System.out.println("the student"+this.id);
		System.out.println("the student"+this.name);
		System.out.println("the student"+this.age);
		System.out.println("************");
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Student a1=new Student(1, "vis", 19);
		Student a2=new Student(2, "vs", a1);
		Student a3=new Student(3, a2, 20);
				a1.display();
				a2.display();
				a3.display();
	}

}
