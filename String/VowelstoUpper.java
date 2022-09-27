package String;

public class VowelstoUpper {
	public static void main(String[] args) {
		String str = "piyush bhatt";
		String str1 = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				str1 = str1 + (char)(str.charAt(i)-32);
			}
			else {
				str1 = str1 + str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
