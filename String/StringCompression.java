package String;

import java.util.Stack;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aaabbccdsa";
		String s ="";
		int i;
		int count = 1;
		for(i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else if(count>1) {
				s=s+str.charAt(i)+count;
				count = 1;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		if(str.charAt(str.length()-1)!=str.charAt(str.length()-2)){
			s = s + str.charAt(str.length()-1);
		}
		System.out.println(s);
		
	}
}
