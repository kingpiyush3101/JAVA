package Accenture;

import java.util.Arrays;

public class AnagramStrings {
	static boolean check(String a,String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		char ca[]=a.toCharArray();
		char cb[]=b.toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);
		for(int i=0;i<ca.length;i++) {
			if(ca[i]!=cb[i]) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String a = "Listen";
		String b = "Silent";
		if(check(a,b)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
