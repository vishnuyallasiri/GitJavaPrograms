package GenericType;
import java.util.Arrays;
import java.util.Comparator;
class LenCom implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		int p=s1.length()-s2.length();
		return p;
	}

	@Override
	public String toString() {
		return "LenCom []";
	}
	
}
 

public class CompareAndBasedOnTheStringSize {

	public static void main(String[] args) {
		String [] a1= {"vishnu", "vis"};
		
		Arrays.sort(a1, new LenCom());
		for(String s:a1)
		{
			System.out.println(s);
		}

	}

}
