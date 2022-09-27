package String;

public class ReducedString {
	static String fun(String s) {
		String k ="";
		if(s.length()%2==0) {
			k = k + s.charAt(0);
			for(int i=1;i<s.length();i+=2) {
				k = k + s.charAt(i);
			}
			return k;
		}
		else {
			for(int i=0;i<s.length();i+=2) {
				k = k + s.charAt(i);
			}
			return k;
		}
	}
	public static void main(String[] args) {
		System.out.println(fun("REQUEST"));
	}
}
