package Accenture;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String str = "apples";
		char ch1 = 'a';
		char ch2 = 'p';
		String s = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch1) {
				s = s + ch2;
			}
			else if(str.charAt(i)==ch2) {
				s = s + ch1;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
