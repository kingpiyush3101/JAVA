package String;

public class caseConversionUsingFunction {
	public static String fun(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.charAt(i)>=65&&str.charAt(i)<=90) {
                 ch = (char)(str.charAt(i) + 32);
			}
			if(str.charAt(i)>=97&&str.charAt(i)<=122){
				ch = (char)(str.charAt(i) - 32);
			}
			s = s + ch;
		}
		return s;
	}
	public static void main(String[] args) {
		String str = "Ae#llo"; //aE#LLO
		System.out.println(fun(str));
	}
}
