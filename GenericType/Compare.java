package GenericType;
import java.lang.Comparable;
import java.util.Arrays;


class Circle implements Comparable<Circle>{
	int radius;
	Circle(int r){
		radius=r;
	}
	
	@Override
	public int compareTo(Circle c) {
		return radius-c.radius;
		
	}
	@Override
	public String toString() {
		return "Circle[radius="+radius+"]";
		
	}
	}

public class Compare {

	public static void main(String[] args) {
		Circle [] ar=new Circle[3];
		ar[0]=new Circle(10);
		ar[1]=new Circle(5);
		ar[2]=new Circle(12);
		
		Arrays.sort(ar);
		for(Circle c:ar) System.out.println(c);
	}
	
}

	


