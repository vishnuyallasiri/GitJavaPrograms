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
	void display()
	{
		System.out.print("the student"+this.id);
		System.out.print("the student"+this.name);
		System.out.print("the student"+this.age);
	}
	
}

public class Test31 {

	public static void main(String[] args) {
		
		Student a1=new Student(1, "vis", 19);
				a1.display();
	}

}
