package String;

public class ReverseString {
	public static String Reverse(String str) {
		String s = "";
		
//		for(int i = str.length()-1;i>=0;i--) {
//			s = s + str.charAt(i);
//		}
		
		for(int i=0;i<str.length();i++) {
			s = str.charAt(i) + s;
		}
		
		return s;
	}
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(Reverse(str));
	}
}
