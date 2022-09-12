package GenericType;
import java.util.Arrays;
import java.lang.Comparable;

import java.util.Comparator;

class Emp implements Comparable<Emp>
{
	String name;
	double salary;
	public Emp(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Emp s) {
		int p=name.compareTo(s.name);
		return p;
	}
	
	
}
class Comsalary implements Comparator<Emp>
{

	@Override
	public int compare(Emp s1, Emp s2) {
		if (s1.salary<s2.salary) return 1;
		if (s1.salary>s2.salary) return -1;
		return 0;
	}
	
}


public class CompareTheSalaryOfTheEmployee {

	public static void main(String[] args) {
		Emp[] Employees=new Emp[3];
		Employees[0]=new Emp("Vishnu",56000);
		Employees[1]=new Emp("vijay",62000);
		Employees[2]=new Emp("Ram",56000);
		Comparator a1=new Comsalary();
		Arrays.sort(Employees, a1);
		for (Emp ar:Employees)
		{
		System.out.println(ar);
		}

	}

}
