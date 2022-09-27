package ExceptionHandling;

import java.util.Scanner;

public class PasswordTooShort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String u = sc.next();
			String s = sc.next();
			if(s.length()<6) {
				throw new Exception("Too Short!");
			}
			int i;
			for(i=0;i<s.length();i++) {
				if(s.charAt(i)>=48&&s.charAt(i)<=57) {
					break;
				}
			}
			if(i==s.length()) {
				throw new Exception("No Digit!");
			}
			System.out.println("Correct");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
