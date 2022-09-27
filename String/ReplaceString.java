package String;

public class ReplaceString {
	static void Replace(String str, String str1) {
		String s[] = str.split(" ");
		String s1="";
		s1 = s1 + str.substring(0, ((s[0].length()-str1.length())));
		s1 = s1 + str1 +" ";
		s1 = s1 + s[1];
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String str = "Uttaranchal University";
		String str1 = "khand";
		String a=str.replace("nchal", str1);
		System.out.println(a);
		
	}
}
