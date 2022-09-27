package String;

import java.util.Arrays;

public class Anagram {
	static boolean AnagramMY(String str,String str1) {
		if(str.length()!=str1.length()) {
			return false;
		}
		else {
			int j;
			for(int i=0;i<str.length();i++) {
				for(j=0;j<str1.length();j++) {
					if(str.charAt(i)==str1.charAt(j)) {
						break;
					}
					else {
						continue;
					}
				}
				if(j==str.length()) {
					return false;
				}
			}
			return true;
		}	
	}
	
	static boolean AnagramArray(String str,String str1) {
		char s[]=str.toCharArray();
		char s1[]=str1.toCharArray();
		Arrays.sort(s);
		Arrays.sort(s1);
//		for(int i=0;i<str.length();i++) {
//			if(s[i]!=s1[i]) {
//				return false;
//			}
//		}
		if(Arrays.equals(s, s1)) {
			return true;
		}
		return false;
		
		//array to string
		//String se = String.valueOf(s1); 
	}
	
	public static void main(String[] args) {
		String str = "piyush";
		String str1 = "iuphsy";
		//System.out.println(AnagramMY(str, str1));
		System.out.println(AnagramArray(str, str1));
	}
}
