package Strings1;

public class CountTheString {

	public static void main(String[] args) {
		
		String s="javadeveloper";
		while(s.length()>0) {
		char c=s.charAt(0);
		String s2=s.replace(c+" ", "");
		int count=s.length()-s2.length();
		System.out.println(c+"="+count);
		}

	}

}
