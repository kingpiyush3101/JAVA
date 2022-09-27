package Recursion;

public class ReverseString {
	static String s ="";
	static String reverse(String str) {
		int i=str.length()-1;
		if(str.length()==0) {
			return s ;
		}
		else {
			char ch = str.charAt(i); 
			s = s + ch;
			reverse(str.substring(0,i));
		}
		return s;
	}
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverse(str));
	}
}
