package GenericType;
import java.lang.Comparable;
import java.util.Arrays;
class Student implements Comparable<Student>{
	int roll;
	String name;
	private static int x=1;

	Student(String s){
		this.name=s;
		roll=x++;
		
	}

	@Override
	public int compareTo(Student arg) {
		int p=name.compareTo(arg.name);
		return p;
	}
	@Override
	public String toString() {
		return "Student[name="+name+","+ roll+"id]";
	}
	
}


public class compareString {

	public static void main(String[] args) {
		Student [] arr=new Student[3];
		arr[0]=new Student("vishnu");
		arr[1]=new Student("vis");
		arr[2]=new Student("empire");
		Arrays.sort(arr);
		for(Student n:arr) {
			System.out.println(n);
		}
		

	}

}
